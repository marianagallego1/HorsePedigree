package com.udea.horsePedigree.DTO;

import jakarta.persistence.Column;

public class CampeonatoDTO {
    private int idCampeonato;
    private String nombre;

    /*private Date fechaCampeonato;*/

    private String ubicacion;

    private String descripción;

    private String nivelDeCampeonato;

    public CampeonatoDTO() {}

    public CampeonatoDTO(int idCampeonato, String nombre, String ubicacion, String descripción, String nivelDeCampeonato) {
        this.idCampeonato = idCampeonato;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripción = descripción;
        this.nivelDeCampeonato = nivelDeCampeonato;
    }

    public int getIdCampeonato() {
        return idCampeonato;
    }

    public void setIdCampeonato(int idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getNivelDeCampeonato() {
        return nivelDeCampeonato;
    }

    public void setNivelDeCampeonato(String nivelDeCampeonato) {
        this.nivelDeCampeonato = nivelDeCampeonato;
    }
}
