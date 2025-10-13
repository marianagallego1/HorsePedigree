package com.udea.horsePedigree.mapper;

import com.udea.horsePedigree.DTO.ArbolGenealogicoDTO;
import com.udea.horsePedigree.entity.ArbolGenealogico;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ArbolGenealogicoMapper {
    ArbolGenealogicoMapper INSTANCE = Mappers.getMapper(ArbolGenealogicoMapper.class);
    ArbolGenealogicoDTO toDTO(ArbolGenealogico arbolGenealogico);
    ArbolGenealogico toEntity(ArbolGenealogicoDTO arbolGenealogicoDTO);
}
