package com.udea.horsePedigree.mapper;

import com.udea.horsePedigree.DTO.EquinoCampeonatoDTO;
import com.udea.horsePedigree.entity.EquinoCampeonato;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EquinoCampeonatoMapper {

    @Mapping(source = "equino.idEquino", target = "idEquino")
    @Mapping(source = "categoria.idCategoria", target = "idCategoria")
    @Mapping(source = "campeonato.idCampeonato", target = "idCampeonato")
    EquinoCampeonatoDTO toDTO(EquinoCampeonato equinoCampeonato);

    // El service se encarga de llenar las relaciones.
    EquinoCampeonato toEntity(EquinoCampeonatoDTO dto);
}
