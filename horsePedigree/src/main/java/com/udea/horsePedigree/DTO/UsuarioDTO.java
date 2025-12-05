package com.udea.horsePedigree.DTO;

import lombok.Data;

@Data
public class UsuarioDTO {

    private Long idUsuario;

    private String nombre;

    private String apellido;

    private String username;

    private String email;

    private String idRol;  // <- CORREGIDO (antes Long)
}
