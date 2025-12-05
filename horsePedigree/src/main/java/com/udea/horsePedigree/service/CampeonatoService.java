package com.udea.horsePedigree.service;

import com.udea.horsePedigree.DTO.CampeonatoDTO;
import com.udea.horsePedigree.entity.Campeonato;
import com.udea.horsePedigree.mapper.CampeonatoMapper;
import com.udea.horsePedigree.repository.CampeonatoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CampeonatoService {

    private final CampeonatoRepository repository;
    private final CampeonatoMapper mapper;

    // CREATE
    public CampeonatoDTO crear(CampeonatoDTO dto) {
        Campeonato entidad = mapper.toEntity(dto);
        return mapper.toDTO(repository.save(entidad));
    }

    // READ ONE
    public CampeonatoDTO obtenerPorId(int id) {
        return repository.findById(id)
                .map(mapper::toDTO)
                .orElseThrow(() -> new RuntimeException("No existe campeonato con id " + id));
    }

    // READ ALL
    public List<CampeonatoDTO> obtenerTodos() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    // UPDATE
    public CampeonatoDTO actualizar(int id, CampeonatoDTO dto) {
        Campeonato existente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("No existe campeonato con id " + id));

        existente.setNombre(dto.getNombre());
        existente.setDescripcion(dto.getDescripcion());
        existente.setNivelDeCampeonato(dto.getNivelDeCampeonato());
        existente.setUbicacion(dto.getUbicacion());
        existente.setFechaCampeonato(dto.getFechaCampeonato());

        return mapper.toDTO(repository.save(existente));
    }

    // DELETE
    public void eliminar(int id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("No existe campeonato con id " + id);
        }
        repository.deleteById(id);
    }
}
