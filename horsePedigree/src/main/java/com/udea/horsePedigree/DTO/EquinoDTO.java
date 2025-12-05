package com.udea.horsePedigree.DTO;

import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class EquinoDTO {

    private int idEquino;

    private String nombre;
    private String apellido;
    private String tipoDeSangre;
    private String estaVivo;
    private String observacion;
    private String urlFoto;
    private String genero;
    private String idChip;

    // Relaciones como IDs
    private String idTipoDePaso;
    private Integer idPropietario;
    private Integer idArbolGenealogico;

    // Fechas
    private LocalDate fechaDeNacimiento;
    private LocalDate fechaDeFallecimiento;
    private LocalDateTime fechaDeCreacion;
    private LocalDateTime fechaDeActualizacion;
}
