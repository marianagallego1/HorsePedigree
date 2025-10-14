package com.udea.horsePedigree.service;

import com.udea.horsePedigree.DTO.PropietarioDTO;
import com.udea.horsePedigree.entity.Propietario;
import com.udea.horsePedigree.mapper.PropietarioMapper;
import com.udea.horsePedigree.repository.PropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropietarioService {

    private final PropietarioRepository propietarioRepository;
    private final PropietarioMapper propietarioMapper;

    @Autowired
    public PropietarioService(PropietarioRepository propietarioRepository, PropietarioMapper propietarioMapper) {
        this.propietarioRepository = propietarioRepository;
        this.propietarioMapper = propietarioMapper;
    }

    public PropietarioDTO crearPropietario(PropietarioDTO propietarioDTO) {
        Propietario propietario = propietarioMapper.toEntity(propietarioDTO);
        return propietarioMapper.toDTO(propietarioRepository.save(propietario));
    }
}
