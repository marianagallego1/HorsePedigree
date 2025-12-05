package com.udea.horsePedigree.mapper;

import com.udea.horsePedigree.DTO.EquinoDTO;
import com.udea.horsePedigree.entity.Equino;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EquinoMapper {

    @Mapping(source = "tipoDePaso.idTipoDePaso", target = "idTipoDePaso")
    @Mapping(source = "propietario.idPropietario", target = "idPropietario")
    @Mapping(source = "arbolGenealogico.idArbol", target = "idArbolGenealogico")
    EquinoDTO toDTO(Equino equino);

    Equino toEntity(EquinoDTO dto);
}
