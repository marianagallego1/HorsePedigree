package com.udea.horsePedigree.service;

import com.udea.horsePedigree.DTO.Equino_CampeonatoDTO;
import com.udea.horsePedigree.entity.Equino_Campeonato;
import com.udea.horsePedigree.mapper.Equino_CampeonatoMapper;
import com.udea.horsePedigree.repository.Equino_CampeonatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Equino_CampeonatoService {
    private final Equino_CampeonatoRepository equino_CampeonatoRepository;
    private final Equino_CampeonatoMapper equino_CampeonatoMapper;

    @Autowired
    public Equino_CampeonatoService(Equino_CampeonatoRepository equino_CampeonatoRepository, Equino_CampeonatoMapper equino_CampeonatoMapper) {
        this.equino_CampeonatoRepository = equino_CampeonatoRepository;
        this.equino_CampeonatoMapper = equino_CampeonatoMapper;
    }

    public Equino_CampeonatoDTO crearEquino_Campeonato(Equino_CampeonatoDTO equino_CampeonatoDTO) {
        Equino_Campeonato equino_Campeonato = equino_CampeonatoMapper.toEntity(equino_CampeonatoDTO);
        return equino_CampeonatoMapper.toDTO(equino_CampeonatoRepository.save(equino_Campeonato));
    }
}
