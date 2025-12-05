package com.udea.horsePedigree.service;

import com.udea.horsePedigree.DTO.EquinoCampeonatoDTO;
import com.udea.horsePedigree.entity.*;
import com.udea.horsePedigree.mapper.EquinoCampeonatoMapper;
import com.udea.horsePedigree.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquinoCampeonatoService {

    private final EquinoCampeonatoRepository repository;
    private final EquinoRepository equinoRepository;
    private final CategoriaRepository categoriaRepository;
    private final CampeonatoRepository campeonatoRepository;
    private final EquinoCampeonatoMapper mapper;

    // CREATE
    public EquinoCampeonatoDTO crear(EquinoCampeonatoDTO dto) {

        EquinoCampeonato entidad = new EquinoCampeonato();

        entidad.setEquino(
                equinoRepository.findById(dto.getIdEquino())
                        .orElseThrow(() -> new RuntimeException("Equino no encontrado"))
        );

        entidad.setCategoria(
                categoriaRepository.findById(dto.getIdCategoria())
                        .orElseThrow(() -> new RuntimeException("Categoría no encontrada"))
        );

        entidad.setCampeonato(
                campeonatoRepository.findById(dto.getIdCampeonato())
                        .orElseThrow(() -> new RuntimeException("Campeonato no encontrado"))
        );

        entidad.setPuntaje(dto.getPuntaje());
        entidad.setResultado(dto.getResultado());
        entidad.setProcedencia(dto.getProcedencia());

        return mapper.toDTO(repository.save(entidad));
    }

    // GET ONE
    public EquinoCampeonatoDTO obtenerPorId(Integer id) {
        return repository.findById(id)
                .map(mapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Registro no encontrado con ID " + id));
    }

    // GET ALL
    public List<EquinoCampeonatoDTO> obtenerTodos() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    // DELETE
    public void eliminar(Integer id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("No existe registro con ID " + id);
        }
        repository.deleteById(id);
    }
}
