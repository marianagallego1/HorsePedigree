package com.udea.horsePedigree.service;

import java.time.LocalDate;
import com.udea.horsePedigree.DTO.PropietarioDTO;
import com.udea.horsePedigree.entity.Propietario;
import com.udea.horsePedigree.mapper.PropietarioMapper;
import com.udea.horsePedigree.repository.PropietarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PropietarioService {

    private final PropietarioRepository repository;
    private final PropietarioMapper mapper;

    // CREATE
    public PropietarioDTO crear(PropietarioDTO dto) {
        Propietario entity = mapper.toEntity(dto);
        entity.setFechaDeRegistro(LocalDateTime.now());
        return mapper.toDTO(repository.save(entity));
    }

    // READ ONE
    public PropietarioDTO obtenerPorId(int id) {
        return repository.findById(id)
                .map(mapper::toDTO)
                .orElseThrow(() -> new RuntimeException("No existe propietario con id " + id));
    }

    // READ ALL
    public List<PropietarioDTO> obtenerTodos() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    // UPDATE
    public PropietarioDTO actualizar(int id, PropietarioDTO dto) {
        Propietario existente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("No existe propietario con id " + id));

        existente.setNombre(dto.getNombre());
        existente.setAlias(dto.getAlias());
        existente.setApellido(dto.getApellido());
        existente.setCedula(dto.getCedula());
        existente.setTelefono(dto.getTelefono());
        existente.setEmail(dto.getEmail());
        existente.setDireccion(dto.getDireccion());
        existente.setFechaDeNacimiento(dto.getFechaDeNacimiento() != null
                ? LocalDate.parse(dto.getFechaDeNacimiento())
                : existente.getFechaDeNacimiento());

        return mapper.toDTO(repository.save(existente));
    }

    // DELETE
    public void eliminar(int id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("No existe propietario con id " + id);
        }
        repository.deleteById(id);
    }
}
