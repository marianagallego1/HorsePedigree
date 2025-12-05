package com.udea.horsePedigree.service;

import com.udea.horsePedigree.DTO.ArbolGenealogicoDTO;
import com.udea.horsePedigree.entity.ArbolGenealogico;
import com.udea.horsePedigree.entity.Equino;
import com.udea.horsePedigree.mapper.ArbolGenealogicoMapper;
import com.udea.horsePedigree.repository.ArbolGenealogicoRepository;
import com.udea.horsePedigree.repository.EquinoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArbolGenealogicoService {

    private final ArbolGenealogicoRepository repository;
    private final EquinoRepository equinoRepository;
    private final ArbolGenealogicoMapper mapper;

    // -------- CREATE --------
    public ArbolGenealogicoDTO crear(ArbolGenealogicoDTO dto) {
        ArbolGenealogico entidad = new ArbolGenealogico();

        entidad.setObservacion(dto.getObservacion());

        entidad.setPadre(resolveEquino(dto.getIdPadre()));
        entidad.setMadre(resolveEquino(dto.getIdMadre()));
        entidad.setAbueloPaterno(resolveEquino(dto.getIdAbueloPaterno()));
        entidad.setAbuelaPaterna(resolveEquino(dto.getIdAbuelaPaterna()));
        entidad.setAbueloMaterno(resolveEquino(dto.getIdAbueloMaterno()));
        entidad.setAbuelaMaterna(resolveEquino(dto.getIdAbuelaMaterna()));

        return mapper.toDTO(repository.save(entidad));
    }

    private Equino resolveEquino(Integer id) {
        if (id == null) return null;
        return equinoRepository.findById(id).orElse(null);
    }

    // -------- READ --------
    public ArbolGenealogicoDTO obtenerPorId(int id) {
        return repository.findById(id)
                .map(mapper::toDTO)
                .orElseThrow(() -> new RuntimeException("No existe árbol con id " + id));
    }

    public List<ArbolGenealogicoDTO> obtenerTodos() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    // -------- UPDATE --------
    public ArbolGenealogicoDTO actualizar(int id, ArbolGenealogicoDTO dto) {

        ArbolGenealogico existente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("No existe árbol con id " + id));

        existente.setObservacion(dto.getObservacion());

        existente.setPadre(resolveEquino(dto.getIdPadre()));
        existente.setMadre(resolveEquino(dto.getIdMadre()));
        existente.setAbueloPaterno(resolveEquino(dto.getIdAbueloPaterno()));
        existente.setAbuelaPaterna(resolveEquino(dto.getIdAbuelaPaterna()));
        existente.setAbueloMaterno(resolveEquino(dto.getIdAbueloMaterno()));
        existente.setAbuelaMaterna(resolveEquino(dto.getIdAbuelaMaterna()));

        return mapper.toDTO(repository.save(existente));
    }

    // -------- DELETE --------
    public void eliminar(int id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("No existe árbol con id " + id);
        }
        repository.deleteById(id);
    }
}

