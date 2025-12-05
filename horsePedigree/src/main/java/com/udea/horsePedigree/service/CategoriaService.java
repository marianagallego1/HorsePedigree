package com.udea.horsePedigree.service;

import com.udea.horsePedigree.DTO.CategoriaDTO;
import com.udea.horsePedigree.entity.Categoria;
import com.udea.horsePedigree.mapper.CategoriaMapper;
import com.udea.horsePedigree.repository.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final CategoriaRepository repository;
    private final CategoriaMapper mapper;

    // CREATE
    public CategoriaDTO crear(CategoriaDTO dto) {
        Categoria entidad = mapper.toEntity(dto);
        return mapper.toDTO(repository.save(entidad));
    }

    // READ ONE
    public CategoriaDTO obtenerPorId(int id) {
        return repository.findById(id)
                .map(mapper::toDTO)
                .orElseThrow(() -> new RuntimeException("No existe categoría con id " + id));
    }

    // READ ALL
    public List<CategoriaDTO> obtenerTodos() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    // UPDATE
    public CategoriaDTO actualizar(int id, CategoriaDTO dto) {
        Categoria existente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("No existe categoría con id " + id));

        existente.setNombreCategoria(dto.getNombreCategoria());

        return mapper.toDTO(repository.save(existente));
    }

    // DELETE
    public void eliminar(int id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("No existe categoría con id " + id);
        }
        repository.deleteById(id);
    }
}
