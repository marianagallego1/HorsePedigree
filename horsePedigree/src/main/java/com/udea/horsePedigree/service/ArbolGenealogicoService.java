package com.udea.horsePedigree.service;

import com.udea.horsePedigree.DTO.ArbolGenealogicoDTO;
import com.udea.horsePedigree.entity.ArbolGenealogico;
import com.udea.horsePedigree.mapper.ArbolGenealogicoMapper;
import com.udea.horsePedigree.repository.ArbolGenealogicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArbolGenealogicoService {
    private final ArbolGenealogicoRepository arbolGenealogicoRepository;
    private final ArbolGenealogicoMapper arbolGenealogicoMapper;

    @Autowired
    public ArbolGenealogicoService(ArbolGenealogicoRepository arbolGenealogicoRepository, ArbolGenealogicoMapper arbolGenealogicoMapper) {
        this.arbolGenealogicoRepository = arbolGenealogicoRepository;
        this.arbolGenealogicoMapper = arbolGenealogicoMapper;
    }

    public ArbolGenealogico crearArbolGenealogico(ArbolGenealogicoDTO arbolGenealogicoDTO) {
        ArbolGenealogico arbolGenealogico = arbolGenealogicoMapper.toEntity(arbolGenealogicoDTO);
        return arbolGenealogicoRepository.save(arbolGenealogico);
    }
}
