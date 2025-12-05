package com.udea.horsePedigree.controller;

import com.udea.horsePedigree.DTO.TipoDePasoDTO;
import com.udea.horsePedigree.service.TipoDePasoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo-de-paso")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class TipoDePasoController {

    private final TipoDePasoService servicio;

    @PostMapping
    public ResponseEntity<TipoDePasoDTO> crear(@RequestBody TipoDePasoDTO dto) {
        return ResponseEntity.status(201).body(servicio.crear(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoDePasoDTO> obtenerPorId(@PathVariable String id) {
        return ResponseEntity.ok(servicio.obtenerPorId(id));
    }

    @GetMapping
    public ResponseEntity<List<TipoDePasoDTO>> obtenerTodos() {
        return ResponseEntity.ok(servicio.obtenerTodos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoDePasoDTO> actualizar(
            @PathVariable String id,
            @RequestBody TipoDePasoDTO dto) {
        return ResponseEntity.ok(servicio.actualizar(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable String id) {
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
