package com.udea.horsePedigree.service;

import com.udea.horsePedigree.DTO.EquinoDTO;
import com.udea.horsePedigree.entity.*;
import com.udea.horsePedigree.mapper.EquinoMapper;
import com.udea.horsePedigree.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EquinoService {

    private final EquinoRepository equinoRepository;
    private final PropietarioRepository propietarioRepository;
    private final TipoDePasoRepository tipoDePasoRepository;
    private final ArbolGenealogicoRepository arbolRepository;
    private final EquinoMapper mapper;

    // ------------ CREATE ------------
    public EquinoDTO crear(EquinoDTO dto) {
        Equino equino = mapper.toEntity(dto);

        equino.setTipoDePaso(resolveTipoDePaso(dto.getIdTipoDePaso()));
        equino.setPropietario(resolvePropietario(dto.getIdPropietario()));
        equino.setArbolGenealogico(resolveArbolGenealogico(dto.getIdArbolGenealogico()));

        equino.setFechaDeCreacion(LocalDateTime.now());
        equino.setFechaDeActualizacion(LocalDateTime.now());

        return mapper.toDTO(equinoRepository.save(equino));
    }

    // ------------ GET ONE ------------
    public EquinoDTO obtenerPorId(int id) {
        return equinoRepository.findById(id)
                .map(mapper::toDTO)
                .orElseThrow(() -> new RuntimeException("No existe equino con ID " + id));
    }

    // ------------ GET ALL ------------
    public List<EquinoDTO> obtenerTodos() {
        return equinoRepository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    // ------------ UPDATE ------------
    public EquinoDTO actualizar(int id, EquinoDTO dto) {
        Equino existente = equinoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No existe equino con ID " + id));

        existente.setNombre(dto.getNombre());
        existente.setApellido(dto.getApellido());
        existente.setTipoDeSangre(dto.getTipoDeSangre());
        existente.setEstaVivo(dto.getEstaVivo());
        existente.setObservacion(dto.getObservacion());
        existente.setUrlFoto(dto.getUrlFoto());
        existente.setGenero(dto.getGenero());
        existente.setIdChip(dto.getIdChip());
        existente.setFechaDeNacimiento(dto.getFechaDeNacimiento());
        existente.setFechaDeFallecimiento(dto.getFechaDeFallecimiento());

        existente.setTipoDePaso(resolveTipoDePaso(dto.getIdTipoDePaso()));
        existente.setPropietario(resolvePropietario(dto.getIdPropietario()));
        existente.setArbolGenealogico(resolveArbolGenealogico(dto.getIdArbolGenealogico()));

        existente.setFechaDeActualizacion(LocalDateTime.now());

        return mapper.toDTO(equinoRepository.save(existente));
    }

    // ------------ DELETE ------------
    public void eliminar(int id) {
        if (!equinoRepository.existsById(id)) {
            throw new RuntimeException("No existe equino con ID " + id);
        }
        equinoRepository.deleteById(id);
    }

    // ------------ HELPERS ------------
    private Propietario resolvePropietario(Integer id) {
        return id == null ? null : propietarioRepository.findById(id).orElse(null);
    }

    private TipoDePaso resolveTipoDePaso(String id) {
        return id == null ? null : tipoDePasoRepository.findById(id).orElse(null);
    }

    private ArbolGenealogico resolveArbolGenealogico(Integer id) {
        return id == null ? null : arbolRepository.findById(id).orElse(null);
    }
}
