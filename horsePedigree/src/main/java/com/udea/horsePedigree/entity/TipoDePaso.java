package com.udea.horsePedigree.entity;

import jakarta.persistence.*;

@Entity
@Table(name="TipoDePaso")
public class TipoDePaso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int TipoDePaso;

    @Column(nullable=false, length=10)
    private String tipo;

    @Column(nullable=false, length=10)
    private String descripcion;


    public TipoDePaso() {}

    public int getTipoDePaso() {
        return TipoDePaso;
    }

    public void setTipoDePaso(int tipoDePaso) {
        TipoDePaso = tipoDePaso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
