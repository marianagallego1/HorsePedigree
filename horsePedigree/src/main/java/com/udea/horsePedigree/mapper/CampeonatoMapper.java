package com.udea.horsePedigree.mapper;

import com.udea.horsePedigree.DTO.CampeonatoDTO;
import com.udea.horsePedigree.entity.Campeonato;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CampeonatoMapper {
    CampeonatoMapper INSTANCE = Mappers.getMapper(CampeonatoMapper.class);
    CampeonatoDTO toDTO(Campeonato campeonato);
    Campeonato toEntity(CampeonatoDTO campeonatoDTO);
}
