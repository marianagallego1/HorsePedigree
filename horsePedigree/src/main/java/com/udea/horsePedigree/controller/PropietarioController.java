package com.udea.horsePedigree.controller;

import com.udea.horsePedigree.DTO.PropietarioDTO;
import com.udea.horsePedigree.service.PropietarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/propietarios")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class PropietarioController {

    private final PropietarioService service;

    @PostMapping
    public ResponseEntity<PropietarioDTO> crear(@RequestBody PropietarioDTO dto){
        return ResponseEntity.status(201).body(service.crear(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PropietarioDTO> obtenerPorId(@PathVariable int id) {
        return ResponseEntity.ok(service.obtenerPorId(id));
    }

    @GetMapping
    public ResponseEntity<List<PropietarioDTO>> obtenerTodos() {
        return ResponseEntity.ok(service.obtenerTodos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<PropietarioDTO> actualizar(@PathVariable int id,
                                                     @RequestBody PropietarioDTO dto) {
        return ResponseEntity.ok(service.actualizar(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable int id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
