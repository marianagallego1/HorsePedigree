package com.udea.horsePedigree.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRol;

    @Column(nullable=false, length=100)
    private String Descripcion;

    public Rol() {}

    public int getRol() {
        return idRol;
    }

    public void setRol(int idRol) {
        this.idRol = idRol;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
