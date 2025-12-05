package com.udea.horsePedigree.controller;

import com.udea.horsePedigree.DTO.ArbolGenealogicoDTO;
import com.udea.horsePedigree.service.ArbolGenealogicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/arbol-genealogico")
@RequiredArgsConstructor
public class ArbolGenealogicoController {

    private final ArbolGenealogicoService service;

    @PostMapping
    public ResponseEntity<ArbolGenealogicoDTO> crear(@RequestBody ArbolGenealogicoDTO dto) {
        return ResponseEntity.status(201).body(service.crear(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ArbolGenealogicoDTO> obtenerPorId(@PathVariable int id) {
        return ResponseEntity.ok(service.obtenerPorId(id));
    }

    @GetMapping
    public ResponseEntity<List<ArbolGenealogicoDTO>> obtenerTodos() {
        return ResponseEntity.ok(service.obtenerTodos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ArbolGenealogicoDTO> actualizar(
            @PathVariable int id,
            @RequestBody ArbolGenealogicoDTO dto) {
        return ResponseEntity.ok(service.actualizar(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable int id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
