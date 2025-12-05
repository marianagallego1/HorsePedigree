package com.udea.horsePedigree.mapper;

import com.udea.horsePedigree.DTO.UsuarioDTO;
import com.udea.horsePedigree.entity.Usuario;
import org.mapstruct.*;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UsuarioMapper {

    // ENTITY → DTO
    @Mapping(target = "idRol", source = "rol.idRol")
    UsuarioDTO toDTO(Usuario usuario);

    // DTO → ENTITY (mapper NO toca repositorios)
    @Mapping(target = "rol", ignore = true)
    @Mapping(target = "password", ignore = true)
    Usuario toEntity(UsuarioDTO dto);
}
