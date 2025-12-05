package com.udea.horsePedigree.mapper;

import com.udea.horsePedigree.DTO.ArbolGenealogicoDTO;
import com.udea.horsePedigree.entity.ArbolGenealogico;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ArbolGenealogicoMapper {

    @Mapping(target = "idPadre", expression = "java(arbol.getPadre() != null ? arbol.getPadre().getIdEquino() : null)")
    @Mapping(target = "idMadre", expression = "java(arbol.getMadre() != null ? arbol.getMadre().getIdEquino() : null)")
    @Mapping(target = "idAbueloPaterno", expression = "java(arbol.getAbueloPaterno() != null ? arbol.getAbueloPaterno().getIdEquino() : null)")
    @Mapping(target = "idAbuelaPaterna", expression = "java(arbol.getAbuelaPaterna() != null ? arbol.getAbuelaPaterna().getIdEquino() : null)")
    @Mapping(target = "idAbueloMaterno", expression = "java(arbol.getAbueloMaterno() != null ? arbol.getAbueloMaterno().getIdEquino() : null)")
    @Mapping(target = "idAbuelaMaterna", expression = "java(arbol.getAbuelaMaterna() != null ? arbol.getAbuelaMaterna().getIdEquino() : null)")
    ArbolGenealogicoDTO toDTO(ArbolGenealogico arbol);

    // La conversión inversa se hará manual en el Service
}
