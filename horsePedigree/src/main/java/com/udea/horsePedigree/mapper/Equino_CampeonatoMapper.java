package com.udea.horsePedigree.mapper;

import com.udea.horsePedigree.DTO.Equino_CampeonatoDTO;
import com.udea.horsePedigree.entity.Equino_Campeonato;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface Equino_CampeonatoMapper {
    Equino_CampeonatoMapper INSTANCE = Mappers.getMapper(Equino_CampeonatoMapper.class);
    Equino_CampeonatoDTO toDTO(Equino_Campeonato equinoCampeonato);
    Equino_Campeonato toEntity(Equino_CampeonatoDTO equinoCampeonatoDTO);
}
