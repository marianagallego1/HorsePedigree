package com.udea.horsePedigree.service;

import com.udea.horsePedigree.entity.ArbolGenealogico;
import com.udea.horsePedigree.entity.Campeonato;
import com.udea.horsePedigree.repository.ArbolGenealogicoRepository;
import com.udea.horsePedigree.repository.CampeonatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampeonatoService {
    @Autowired
    private CampeonatoRepository campeonatoRepository;

    public Campeonato guardarCampeonato(Campeonato campeonato){
        return campeonatoRepository.save(campeonato);
    }
}
