package com.udea.horsePedigree.controller;

import com.udea.horsePedigree.DTO.RolDTO;
import com.udea.horsePedigree.service.RolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rol")
@RequiredArgsConstructor
public class RolController {

    private final RolService rolService;

    @PostMapping
    public ResponseEntity<RolDTO> crear(@RequestBody RolDTO dto) {
        return ResponseEntity.status(201).body(rolService.crear(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RolDTO> obtenerPorId(@PathVariable String id) {
        return ResponseEntity.ok(rolService.obtenerPorId(id));
    }

    @GetMapping
    public ResponseEntity<List<RolDTO>> obtenerTodos() {
        return ResponseEntity.ok(rolService.obtenerTodos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<RolDTO> actualizar(@PathVariable String id,
                                             @RequestBody RolDTO dto) {
        return ResponseEntity.ok(rolService.actualizar(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable String id) {
        rolService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
