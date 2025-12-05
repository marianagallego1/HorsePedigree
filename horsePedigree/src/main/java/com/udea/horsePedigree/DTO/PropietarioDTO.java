package com.udea.horsePedigree.DTO;

import lombok.Data;

@Data
public class PropietarioDTO {

    private Integer idPropietario;
    private String nombre;
    private String alias;
    private String apellido;
    private Long cedula;
    private Long telefono;
    private String email;
    private String direccion;
    private String fechaDeNacimiento; // yyyy-MM-dd
}
