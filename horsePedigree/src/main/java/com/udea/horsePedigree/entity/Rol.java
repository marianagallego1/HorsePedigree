package com.udea.horsePedigree.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Rol")
public class Rol {

    // Propiedades
    @Id
    @Column(nullable=false, length=10)
    private String idRol;

    @Column(nullable=false, length=100)
    private String Descripcion;


    // Constructores
    public Rol() {}

    public Rol(String idRol, String descripcion) {
        this.idRol = idRol;
        Descripcion = descripcion;
    }


    // Relación con Usuario
    @OneToMany(mappedBy = "idRol", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Usuario> usuarios;


    // Getters y setters

    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
