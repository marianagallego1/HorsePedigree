package com.udea.horsePedigree.service;

import com.udea.horsePedigree.DTO.TipoDePasoDTO;
import com.udea.horsePedigree.entity.TipoDePaso;
import com.udea.horsePedigree.mapper.TipoDePasoMapper;
import com.udea.horsePedigree.repository.TipoDePasoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoDePasoService {

    private final TipoDePasoRepository repository;
    private final TipoDePasoMapper mapper;

    // CREATE
    public TipoDePasoDTO crear(TipoDePasoDTO dto) {
        TipoDePaso entidad = mapper.toEntity(dto);
        return mapper.toDTO(repository.save(entidad));
    }

    // GET ONE
    public TipoDePasoDTO obtenerPorId(String id) {
        return repository.findById(id)
                .map(mapper::toDTO)
                .orElseThrow(() -> new RuntimeException("No existe tipo de paso con id " + id));
    }

    // GET ALL
    public List<TipoDePasoDTO> obtenerTodos() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    // UPDATE
    public TipoDePasoDTO actualizar(String id, TipoDePasoDTO dto) {
        TipoDePaso existente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("No existe tipo de paso con id " + id));

        existente.setDescripcion(dto.getDescripcion());

        return mapper.toDTO(repository.save(existente));
    }

    // DELETE
    public void eliminar(String id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("No existe tipo de paso con id " + id);
        }
        repository.deleteById(id);
    }
}
