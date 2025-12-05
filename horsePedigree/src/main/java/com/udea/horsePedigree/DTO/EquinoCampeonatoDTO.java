package com.udea.horsePedigree.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EquinoCampeonatoDTO {

    private Integer id;
    private Integer idEquino;
    private Integer idCategoria;
    private Integer idCampeonato;
    private int puntaje;
    private String resultado;
    private String procedencia;
}
