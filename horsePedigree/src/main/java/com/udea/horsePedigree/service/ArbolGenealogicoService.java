package com.udea.horsePedigree.service;

import com.udea.horsePedigree.entity.ArbolGenealogico;
import com.udea.horsePedigree.repository.ArbolGenealogicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArbolGenealogicoService {
    @Autowired
    private ArbolGenealogicoRepository arbolGenealogicoRepository;

    public ArbolGenealogico guardarArbol(ArbolGenealogico arbolGenealogico) {
        return arbolGenealogicoRepository.save(arbolGenealogico);
    }
}
