package com.udea.horsePedigree.DTO;

import lombok.Data;

@Data
public class ArbolGenealogicoDTO {

    private int idArbol;

    private Integer idPadre;
    private Integer idMadre;
    private Integer idAbueloPaterno;
    private Integer idAbuelaPaterna;
    private Integer idAbueloMaterno;
    private Integer idAbuelaMaterna;

    private String observacion;
}
