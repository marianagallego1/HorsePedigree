package com.udea.horsePedigree.mapper;

import com.udea.horsePedigree.DTO.TipoDePasoDTO;
import com.udea.horsePedigree.entity.TipoDePaso;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TipoDePasoMapper {

    TipoDePasoDTO toDTO(TipoDePaso tipoDePaso);

    TipoDePaso toEntity(TipoDePasoDTO dto);
}

