package com.udea.horsePedigree.DTO;

import jakarta.persistence.Column;

public class PropietarioDTO {
    private int idPropietario;

    private String nombre;

    private String alias;

    private String apellido;

    private Long cedula;

    /*private Date fechaDeNacimiento;*/

    private Long telefono;

    private String email;

    private String direccion;

    /*private Date fechaDeRegistro;*/

    public PropietarioDTO() {}

    public PropietarioDTO(int idPropietario, String nombre, String alias, String apellido, Long cedula, Long telefono, String email, String direccion) {
        this.idPropietario = idPropietario;
        this.nombre = nombre;
        this.alias = alias;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
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
