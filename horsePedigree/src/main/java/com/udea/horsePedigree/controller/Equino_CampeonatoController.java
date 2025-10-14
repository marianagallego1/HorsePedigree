package com.udea.horsePedigree.controller;

import com.udea.horsePedigree.DTO.Equino_CampeonatoDTO;
import com.udea.horsePedigree.service.Equino_CampeonatoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equino_campeonato")
public class Equino_CampeonatoController {
    private final Equino_CampeonatoService equino_CampeonatoService;

    public Equino_CampeonatoController(Equino_CampeonatoService equino_CampeonatoService) {
        this.equino_CampeonatoService = equino_CampeonatoService;
    }

    @PostMapping
    public ResponseEntity<Equino_CampeonatoDTO> crearEquino_Campeonato(@RequestBody Equino_CampeonatoDTO equino_CampeonatoDTO){
        return ResponseEntity.ok(equino_CampeonatoService.crearEquino_Campeonato(equino_CampeonatoDTO));
    }
}
