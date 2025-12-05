package com.udea.horsePedigree.controller;

import com.udea.horsePedigree.DTO.EquinoDTO;
import com.udea.horsePedigree.service.EquinoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equinos")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class EquinoController {

    private final EquinoService service;

    @PostMapping
    public ResponseEntity<EquinoDTO> crear(@RequestBody EquinoDTO dto){
        return ResponseEntity.status(201).body(service.crear(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EquinoDTO> obtenerPorId(@PathVariable int id) {
        return ResponseEntity.ok(service.obtenerPorId(id));
    }

    @GetMapping
    public ResponseEntity<List<EquinoDTO>> obtenerTodos() {
        return ResponseEntity.ok(service.obtenerTodos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<EquinoDTO> actualizar(@PathVariable int id,
                                                @RequestBody EquinoDTO dto) {
        return ResponseEntity.ok(service.actualizar(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable int id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
