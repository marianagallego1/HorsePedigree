package com.udea.horsePedigree.DTO;

import jakarta.persistence.Column;

public class Equino_CampeonatoDTO {
    private int equino_Campeonato;

    private int idEquino;

    private int idCategoria;

    private int idCampeonato;

    private String resultado;

    private int puntaje;


    public Equino_CampeonatoDTO() {}

    public Equino_CampeonatoDTO(int equino_Campeonato, int idEquino, int idCategoria, int idCampeonato, String resultado, int puntaje) {
        this.equino_Campeonato = equino_Campeonato;
        this.idEquino = idEquino;
        this.idCategoria = idCategoria;
        this.idCampeonato = idCampeonato;
        this.resultado = resultado;
        this.puntaje = puntaje;
    }

    public int getIdEquino() {
        return idEquino;
    }

    public void setIdEquino(int idEquino) {
        this.idEquino = idEquino;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdCampeonato() {
        return idCampeonato;
    }

    public void setIdCampeonato(int idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
