package com.udea.horsePedigree.service;

import com.udea.horsePedigree.DTO.EquinoDTO;
import com.udea.horsePedigree.entity.Equino;
import com.udea.horsePedigree.mapper.EquinoMapper;
import com.udea.horsePedigree.repository.EquinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquinoService {
    private final EquinoRepository equinoRepository;
    private final EquinoMapper equinoMapper;

    @Autowired
    public EquinoService(EquinoRepository equinoRepository, EquinoMapper equinoMapper) {
        this.equinoRepository = equinoRepository;
        this.equinoMapper = equinoMapper;
    }

    public Equino crearEquino(EquinoDTO equinoDTO) {
        Equino equino = equinoMapper.toEntity(equinoDTO);
        return equinoRepository.save(equino);
    }
}
