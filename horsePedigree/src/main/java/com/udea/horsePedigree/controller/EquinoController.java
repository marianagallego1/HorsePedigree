package com.udea.horsePedigree.controller;

import com.udea.horsePedigree.DTO.EquinoDTO;
import com.udea.horsePedigree.service.EquinoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equino")
public class EquinoController {
    private final EquinoService equinoService;

    public EquinoController(EquinoService equinoService) {
        this.equinoService = equinoService;
    }

    @PostMapping
    public ResponseEntity<EquinoDTO> crearEquino(@RequestBody EquinoDTO equinoDTO){
        return ResponseEntity.ok(equinoService.crearEquino(equinoDTO));
    }
}
