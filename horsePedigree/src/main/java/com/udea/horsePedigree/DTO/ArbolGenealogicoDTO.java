package com.udea.horsePedigree.DTO;

import jakarta.persistence.Column;

public class ArbolGenealogicoDTO {
    private int idArbol;

    private int idPadre;

    private int idMadre;

    private int idAbuelo;

    private int idAbuela;

    private String observacion;

    public ArbolGenealogicoDTO() {}

    public ArbolGenealogicoDTO(int idArbol, int idPadre, int idMadre, int idAbuelo, int idAbuela, String observacion) {
        this.idArbol = idArbol;
        this.idPadre = idPadre;
        this.idMadre = idMadre;
        this.idAbuelo = idAbuelo;
        this.idAbuela = idAbuela;
        this.observacion = observacion;
    }

    public int getIdArbol() {
        return idArbol;
    }

    public void setIdArbol(int idArbol) {
        this.idArbol = idArbol;
    }

    public int getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(int idPadre) {
        this.idPadre = idPadre;
    }

    public int getIdMadre() {
        return idMadre;
    }

    public void setIdMadre(int idMadre) {
        this.idMadre = idMadre;
    }

    public int getIdAbuelo() {
        return idAbuelo;
    }

    public void setIdAbuelo(int idAbuelo) {
        this.idAbuelo = idAbuelo;
    }

    public int getIdAbuela() {
        return idAbuela;
    }

    public void setIdAbuela(int idAbuela) {
        this.idAbuela = idAbuela;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
