package com.udea.horsePedigree.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Categoria")
public class Categoria {

    // Propiedades
    @Id
    @Column(nullable=false, length=50)
    private int idCategoria;

    @Column(nullable=false, length=50)
    private String nombreCategoria;


    // Getters y Setters
    /*public Categoria() {}

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }*/
}
