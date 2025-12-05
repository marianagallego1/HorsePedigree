package com.udea.horsePedigree.service;

import com.udea.horsePedigree.DTO.UsuarioDTO;
import com.udea.horsePedigree.entity.Rol;
import com.udea.horsePedigree.entity.Usuario;
import com.udea.horsePedigree.mapper.UsuarioMapper;
import com.udea.horsePedigree.repository.RolRepository;
import com.udea.horsePedigree.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;
    private final RolRepository rolRepository;
    private final UsuarioMapper mapper;

    // CREATE
    public UsuarioDTO crear(UsuarioDTO dto) {

        Usuario entity = mapper.toEntity(dto);

        // Asignación manual del rol
        if (dto.getIdRol() != null) {
            Rol rol = rolRepository.findById(dto.getIdRol())
                    .orElseThrow(() -> new RuntimeException("No existe rol con id " + dto.getIdRol()));
            entity.setRol(rol);
        }

        // password temporal obligatoria
        entity.setPassword("123456");

        return mapper.toDTO(repository.save(entity));
    }

    // READ ONE
    public UsuarioDTO obtenerPorId(Long id) {
        return repository.findById(id)
                .map(mapper::toDTO)
                .orElseThrow(() -> new RuntimeException("No existe usuario con id " + id));
    }

    // READ ALL
    public List<UsuarioDTO> obtenerTodos() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    // UPDATE
    public UsuarioDTO actualizar(Long id, UsuarioDTO dto) {

        Usuario existente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("No existe usuario con id " + id));

        existente.setNombre(dto.getNombre());
        existente.setApellido(dto.getApellido());
        existente.setUsername(dto.getUsername());
        existente.setEmail(dto.getEmail());

        if (dto.getIdRol() != null) {
            Rol rol = rolRepository.findById(dto.getIdRol())
                    .orElseThrow(() -> new RuntimeException("No existe rol con id " + dto.getIdRol()));
            existente.setRol(rol);
        }

        return mapper.toDTO(repository.save(existente));
    }

    // DELETE
    public void eliminar(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("No existe usuario con id " + id);
        }
        repository.deleteById(id);
    }
}
