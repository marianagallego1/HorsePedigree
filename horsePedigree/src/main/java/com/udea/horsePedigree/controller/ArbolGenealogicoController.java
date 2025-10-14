package com.udea.horsePedigree.controller;

import com.udea.horsePedigree.DTO.ArbolGenealogicoDTO;
import com.udea.horsePedigree.service.ArbolGenealogicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arbolGenealogico")
public class ArbolGenealogicoController {
    private final ArbolGenealogicoService arbolGenealogicoService;

    public ArbolGenealogicoController(ArbolGenealogicoService arbolGenealogicoService) {
        this.arbolGenealogicoService = arbolGenealogicoService;
    }

    @PostMapping
    public ResponseEntity<ArbolGenealogicoDTO> crearArbolGenealogico(@RequestBody ArbolGenealogicoDTO arbolGenealogicoDTO){
        return ResponseEntity.ok(arbolGenealogicoService.crearArbolGenealogico(arbolGenealogicoDTO));
    }
}
