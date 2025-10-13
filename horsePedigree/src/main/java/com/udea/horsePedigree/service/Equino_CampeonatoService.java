package com.udea.horsePedigree.service;

import com.udea.horsePedigree.entity.Equino_Campeonato;
import com.udea.horsePedigree.repository.Equino_CampeonatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Equino_CampeonatoService {
    @Autowired
    private Equino_CampeonatoRepository equino_campeonatoRepository;

    public Equino_Campeonato guardarEquino_Campeonato(Equino_Campeonato equino_campeonato){
        return equino_campeonatoRepository.save(equino_campeonato);
    }
}
