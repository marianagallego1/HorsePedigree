package com.udea.horsePedigree.controller;

import com.udea.horsePedigree.DTO.EquinoCampeonatoDTO;
import com.udea.horsePedigree.service.EquinoCampeonatoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equino-campeonato")
@RequiredArgsConstructor
public class EquinoCampeonatoController {

    private final EquinoCampeonatoService service;

    @PostMapping
    public ResponseEntity<EquinoCampeonatoDTO> crear(@RequestBody EquinoCampeonatoDTO dto) {
        return ResponseEntity.status(201).body(service.crear(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EquinoCampeonatoDTO> obtener(@PathVariable Integer id) {
        return ResponseEntity.ok(service.obtenerPorId(id));
    }

    @GetMapping
    public ResponseEntity<List<EquinoCampeonatoDTO>> listar() {
        return ResponseEntity.ok(service.obtenerTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
