package com.udea.horsePedigree.DTO;


import com.udea.horsePedigree.entity.Rol;

public class UsuarioDTO {
    private Long idUsuario;

    private String nombre;

    private String apellido;

    private String username;

    private String password;

    private Rol idRol;

    private String email;

    /*private Date fechaDeCreacion*/


    // Constructores
    public UsuarioDTO() {}

    public UsuarioDTO(Long idUsuario, String nombre, String apellido, String username, String password, Rol idRol, String email) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.password = password;
        this.idRol = idRol;
        this.email = email;
    }


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
