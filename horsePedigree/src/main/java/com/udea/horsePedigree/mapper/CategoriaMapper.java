package com.udea.horsePedigree.mapper;

import com.udea.horsePedigree.DTO.CategoriaDTO;
import com.udea.horsePedigree.entity.Categoria;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {

    CategoriaDTO toDTO(Categoria categoria);

    Categoria toEntity(CategoriaDTO categoriaDTO);
}

