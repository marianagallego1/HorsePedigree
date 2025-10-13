package com.udea.horsePedigree.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Equino_Campeonato")
public class Equino_Campeonato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int equino_Campeonato;

    @Column(nullable=false, length=50)
    private int idEquino;

    @Column(nullable=false, length=50)
    private int idCategoria;

    @Column(nullable=false, length=50)
    private int idCampeonato;

    @Column(nullable=false, length=50)
    private String resultado;

    @Column(nullable=false, length=50)
    private int puntaje;


    public Equino_Campeonato() {}

    public int getEquino_Campeonato() {
        return equino_Campeonato;
    }

    public void setEquino_Campeonato(int equino_Campeonato) {
        this.equino_Campeonato = equino_Campeonato;
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
