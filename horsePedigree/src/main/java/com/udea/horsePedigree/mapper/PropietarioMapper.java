package com.udea.horsePedigree.mapper;

import com.udea.horsePedigree.DTO.PropietarioDTO;
import com.udea.horsePedigree.entity.Propietario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.time.LocalDate;

@Mapper(componentModel = "spring")
public interface PropietarioMapper {

    @Mapping(target = "fechaDeNacimiento", source = "fechaDeNacimiento", qualifiedByName = "stringToDate")
    Propietario toEntity(PropietarioDTO dto);

    @Mapping(target = "fechaDeNacimiento", source = "fechaDeNacimiento", qualifiedByName = "dateToString")
    PropietarioDTO toDTO(Propietario propietario);

    // ---------- helpers ----------

    @Named("stringToDate")
    public static LocalDate stringToDate(String value) {
        return (value == null || value.isEmpty()) ? null : LocalDate.parse(value);
    }

    @Named("dateToString")
    public static String dateToString(LocalDate date) {
        return (date == null) ? null : date.toString();
    }
}
