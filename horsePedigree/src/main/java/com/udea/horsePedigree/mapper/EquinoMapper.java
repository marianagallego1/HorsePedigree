package com.udea.horsePedigree.mapper;

import com.udea.horsePedigree.DTO.EquinoDTO;
import com.udea.horsePedigree.entity.Equino;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EquinoMapper {
    EquinoMapper INSTANCE = Mappers.getMapper(EquinoMapper.class);
    EquinoDTO toDTO(Equino equino);
    Equino toEntity(EquinoDTO equinoDTO);
}
