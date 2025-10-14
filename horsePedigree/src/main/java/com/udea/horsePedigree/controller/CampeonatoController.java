package com.udea.horsePedigree.controller;

import com.udea.horsePedigree.DTO.CampeonatoDTO;
import com.udea.horsePedigree.service.CampeonatoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/campeonato")
public class CampeonatoController {
    private final CampeonatoService campeonatoService;

    public CampeonatoController(CampeonatoService campeonatoService) {
        this.campeonatoService = campeonatoService;
    }

    @PostMapping
    public ResponseEntity<CampeonatoDTO> crearCampeonato(@RequestBody CampeonatoDTO campeonatoDTO){
        return ResponseEntity.ok(campeonatoService.crearCampeonato(campeonatoDTO));
    }
}
