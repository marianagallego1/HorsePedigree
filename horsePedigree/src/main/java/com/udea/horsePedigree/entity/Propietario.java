package com.udea.horsePedigree.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "propietario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Propietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_propietario")
    private Integer idPropietario;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(length = 50)
    private String alias;

    @Column(nullable = false, length = 50)
    private String apellido;

    @Column(nullable = false)
    private Long cedula;

    @Column(nullable = false)
    private Long telefono;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 50)
    private String direccion;

    @Column(name = "fecha_de_nacimiento", nullable = false)
    private LocalDate fechaDeNacimiento;

    @Column(name = "fecha_de_registro", nullable = false)
    private LocalDateTime fechaDeRegistro;
}
