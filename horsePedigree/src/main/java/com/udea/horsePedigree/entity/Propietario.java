package com.udea.horsePedigree.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Propietario")
public class Propietario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPropietario;

    @Column(nullable=false, length=50)
    private String nombre;

    @Column(length=50)
    private String alias;

    @Column(nullable=false, length=50)
    private String apellido;

    @Column(nullable=false, length=50)
    private Long cedula;

    /*@Column(nullable=false, length=50)
    private Date fechaDeNacimiento;*/

    @Column(nullable=false, length=50)
    private Long telefono;

    @Column(nullable=false, length=50)
    private String email;

    @Column(nullable=false, length=50)
    private String direccion;

    /*@Column(nullable=false, length=50)
    private Date fechaDeRegistro;*/

    public Propietario() {}

    public Propietario(@JsonProperty("idPropietario") int idPropietario,
                       @JsonProperty("nombre") String nombre,
                       @JsonProperty("alias") String alias,
                       @JsonProperty("apellido") String apellido,
                       @JsonProperty("cedula") Long cedula,
                       @JsonProperty("telefono") String telefono,
                       @JsonProperty("email") String email,
                       @JsonProperty("direccion") String direccion) {
        this.idPropietario = idPropietario;
        this.nombre = nombre;
        this.alias = alias;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = Long.parseLong(telefono);
        this.email = email;
        this.direccion = direccion;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
