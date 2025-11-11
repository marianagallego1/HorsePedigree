package com.udea.horsePedigree.controller;

import com.udea.horsePedigree.DTO.EquinoDTO;
import com.udea.horsePedigree.service.EquinoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/equino")
@CrossOrigin(origins = "http://localhost:5500") // Permite las peticiones del frontend
public class EquinoController {
    private final EquinoService equinoService;

    public EquinoController(EquinoService equinoService) {
        this.equinoService = equinoService;
    }

    @PostMapping
    public ResponseEntity<EquinoDTO> crearEquino(@RequestBody EquinoDTO equinoDTO){
        return ResponseEntity.ok(equinoService.crearEquino(equinoDTO));
    }
    @GetMapping("/{id}")
    public ResponseEntity<EquinoDTO> obtenerEquinoPorId(@PathVariable int id) {
        EquinoDTO equino = equinoService.obtenerEquinoPorId(id);
        if (equino != null) {
            return ResponseEntity.ok(equino);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
