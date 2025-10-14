package com.udea.horsePedigree.service;

import com.udea.horsePedigree.DTO.CampeonatoDTO;
import com.udea.horsePedigree.entity.Campeonato;
import com.udea.horsePedigree.mapper.CampeonatoMapper;
import com.udea.horsePedigree.repository.CampeonatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampeonatoService {
    private final CampeonatoRepository campeonatoRepository;
    private final CampeonatoMapper campeonatoMapper;

    @Autowired
    public CampeonatoService(CampeonatoRepository campeonatoRepository, CampeonatoMapper campeonatoMapper) {
        this.campeonatoRepository = campeonatoRepository;
        this.campeonatoMapper = campeonatoMapper;
    }

    public CampeonatoDTO crearCampeonato(CampeonatoDTO campeonatoDTO) {
        Campeonato campeonato = campeonatoMapper.toEntity(campeonatoDTO);
        return campeonatoMapper.toDTO(campeonatoRepository.save(campeonato));
    }
}
