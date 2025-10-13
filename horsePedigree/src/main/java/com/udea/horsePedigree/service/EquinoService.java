package com.udea.horsePedigree.service;

import com.udea.horsePedigree.entity.Equino;
import com.udea.horsePedigree.repository.EquinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquinoService {
    @Autowired
    private EquinoRepository equinoRepository;

    public Equino guardarEquino(Equino equino){
        return equinoRepository.save(equino);
    }
}
