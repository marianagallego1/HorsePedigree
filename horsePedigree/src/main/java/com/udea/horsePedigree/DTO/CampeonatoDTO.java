package com.udea.horsePedigree.DTO;

import lombok.Data;
import java.time.LocalDate;

@Data
public class CampeonatoDTO {

    private Integer idCampeonato;
    private String nombre;
    private String descripcion;
    private String nivelDeCampeonato;
    private String ubicacion;
    private LocalDate fechaCampeonato;
}
