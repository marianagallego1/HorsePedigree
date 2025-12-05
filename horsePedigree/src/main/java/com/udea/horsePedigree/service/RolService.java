package com.udea.horsePedigree.service;

import com.udea.horsePedigree.DTO.RolDTO;
import com.udea.horsePedigree.entity.Rol;
import com.udea.horsePedigree.mapper.RolMapper;
import com.udea.horsePedigree.repository.RolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RolService {

    private final RolRepository rolRepository;
    private final RolMapper rolMapper;

    // CREATE
    public RolDTO crear(RolDTO dto) {
        Rol entity = rolMapper.toEntity(dto);
        return rolMapper.toDTO(rolRepository.save(entity));
    }

    // READ ONE
    public RolDTO obtenerPorId(String id) {
        return rolRepository.findById(id)
                .map(rolMapper::toDTO)
                .orElse(null);
    }

    // READ ALL
    public List<RolDTO> obtenerTodos() {
        return rolRepository.findAll()
                .stream()
                .map(rolMapper::toDTO)
                .collect(Collectors.toList());
    }

    // UPDATE
    public RolDTO actualizar(String id, RolDTO dto) {
        return rolRepository.findById(id)
                .map(existing -> {
                    existing.setDescripcion(dto.getDescripcion());
                    return rolMapper.toDTO(rolRepository.save(existing));
                })
                .orElse(null);
    }

    // DELETE
    public void eliminar(String id) {
        rolRepository.deleteById(id);
    }
}
