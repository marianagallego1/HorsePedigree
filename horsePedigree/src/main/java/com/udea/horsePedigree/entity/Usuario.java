package com.udea.horsePedigree.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="Usuario")
@NoArgsConstructor
public class Usuario {

    // Propiedades
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUsuario;

    @Column(nullable=false, length=50)
    private String nombre;

    @Column(nullable=false, length=50)
    private String apellido;

    @Column(unique=true, length=50, nullable=false)
    private String username;

    @Column(nullable=false, length=50)
    private String password;

    @ManyToOne
    @JoinColumn(name = "idRol", nullable = false)
    private Rol idRol;

    @Column(nullable=false, length=50)
    private String email;

    /*@Column(nullable=false, length=50)
    private Date fechaDeCreacion*/


    // Constructor
    @JsonCreator
    public Usuario(@JsonProperty("idUsuario") Long idUsuario,
                   @JsonProperty("nombre") String nombre,
                   @JsonProperty("apellido") String apellido,
                   @JsonProperty("username") String username,
                   @JsonProperty("password") String password,
                   @JsonProperty("idRol") Rol idRol,
                   @JsonProperty("email") String email) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.password = password;
        this.idRol = idRol;
        this.email = email;
    }


    // Relación con Rol
    /*@ManyToOne
    @JoinColumn(name = "idRol", nullable = false)
    private Rol rol;*/


    // Getters y setters

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getIdRol() {
        return idRol;
    }

    public void setIdRol(Rol idRol) {
        this.idRol = idRol;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
