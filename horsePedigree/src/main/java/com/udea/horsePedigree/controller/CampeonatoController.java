package com.udea.horsePedigree.controller;

import com.udea.horsePedigree.DTO.CampeonatoDTO;
import com.udea.horsePedigree.service.CampeonatoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/campeonatos")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class CampeonatoController {

    private final CampeonatoService service;

    @PostMapping
    public ResponseEntity<CampeonatoDTO> crear(@RequestBody CampeonatoDTO dto) {
        return ResponseEntity.status(201).body(service.crear(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CampeonatoDTO> obtenerPorId(@PathVariable int id) {
        return ResponseEntity.ok(service.obtenerPorId(id));
    }

    @GetMapping
    public ResponseEntity<List<CampeonatoDTO>> obtenerTodos() {
        return ResponseEntity.ok(service.obtenerTodos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<CampeonatoDTO> actualizar(@PathVariable int id,
                                                    @RequestBody CampeonatoDTO dto) {
        return ResponseEntity.ok(service.actualizar(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable int id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
