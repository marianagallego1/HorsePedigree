package com.udea.horsePedigree.mapper;

import com.udea.horsePedigree.DTO.RolDTO;
import com.udea.horsePedigree.entity.Rol;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RolMapper {
    RolDTO toDTO(Rol rol);
    Rol toEntity(RolDTO rolDTO);
}
