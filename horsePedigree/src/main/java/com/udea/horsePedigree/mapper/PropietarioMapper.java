package com.udea.horsePedigree.mapper;

import com.udea.horsePedigree.DTO.PropietarioDTO;
import com.udea.horsePedigree.entity.Propietario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PropietarioMapper {
    PropietarioMapper INSTANCE = Mappers.getMapper(PropietarioMapper.class);
    PropietarioDTO toDTO(Propietario propietario);
    Propietario toEntity(PropietarioDTO propietarioDTO);
}
