package com.udea.horsePedigree.service;

import com.udea.horsePedigree.entity.Propietario;
import com.udea.horsePedigree.repository.PropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropietarioService {
    @Autowired
    private PropietarioRepository propietarioRepository;

    public Propietario guardarPropietario(Propietario propietario) {
        return propietarioRepository.save(propietario);
    }
}
