package com.udea.horsePedigree.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Campeonato")
public class Campeonato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCampeonato;

    @Column(nullable=false, length=100)
    private String nombre;

    /*@Column(nullable=false, length=50)
    private Date fechaCampeonato;*/

    @Column(nullable=false, length=150)
    private String ubicacion;

    @Column(nullable=false, length=1000)
    private String descripción;

    @Column(nullable=false, length=50)
    private String nivelDeCampeonato;

    public Campeonato() {}

    public Campeonato(@JsonProperty("idCampeonato") int idCampeonato,
                      @JsonProperty("nombre") String nombre,
                      @JsonProperty("ubicacion") String ubicacion,
                      @JsonProperty("descripcion") String descripcion,
                      @JsonProperty("nivelDeCampeonato") String nivelDeCampeonato
                      ) {
        this.idCampeonato = idCampeonato;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripción = descripcion;
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
