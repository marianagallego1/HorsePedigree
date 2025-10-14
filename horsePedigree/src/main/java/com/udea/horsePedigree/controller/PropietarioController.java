package com.udea.horsePedigree.controller;

import com.udea.horsePedigree.DTO.PropietarioDTO;
import com.udea.horsePedigree.entity.Propietario;
import com.udea.horsePedigree.service.PropietarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/propietario")
public class PropietarioController {
    private final PropietarioService propietarioService;

    public PropietarioController(PropietarioService propietarioService) {
        this.propietarioService = propietarioService;
    }

    @PostMapping
    public ResponseEntity<PropietarioDTO> crearPropietario(@RequestBody PropietarioDTO propietarioDTO){
        return ResponseEntity.ok(propietarioService.crearPropietario(propietarioDTO));
    }
}
