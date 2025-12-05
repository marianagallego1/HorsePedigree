package com.udea.horsePedigree.mapper;

import com.udea.horsePedigree.DTO.CampeonatoDTO;
import com.udea.horsePedigree.entity.Campeonato;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CampeonatoMapper {

    CampeonatoDTO toDTO(Campeonato campeonato);

    Campeonato toEntity(CampeonatoDTO dto);
}
