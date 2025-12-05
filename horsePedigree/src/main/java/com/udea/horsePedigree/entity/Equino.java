package com.udea.horsePedigree.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "equino")
@Getter
@Setter
public class Equino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equino")
    private Integer idEquino;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String apellido;

    @Column(name = "tipo_de_sangre", nullable = false, length = 3)
    private String tipoDeSangre;

    @Column(name = "esta_vivo", nullable = false, length = 10)
    private String estaVivo;

    @Column(length = 1000)
    private String observacion;

    @Column(name = "url_foto", nullable = false, length = 1000)
    private String urlFoto;

    @Column(nullable = false, length = 1)
    private String genero;

    @Column(name = "id_chip", nullable = false, length = 50)
    private String idChip;

    // ---------- RELACIONES ----------
    @ManyToOne
    @JoinColumn(name = "id_tipo_de_paso")
    private TipoDePaso tipoDePaso;

    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private Propietario propietario;

    @ManyToOne
    @JoinColumn(name = "id_arbol")
    private ArbolGenealogico arbolGenealogico;

    // ---------- FECHAS ----------
    @Column(name = "fecha_de_nacimiento")
    private LocalDate fechaDeNacimiento;

    @Column(name = "fecha_de_fallecimiento")
    private LocalDate fechaDeFallecimiento;

    @Column(name = "fecha_de_creacion", nullable = false)
    private LocalDateTime fechaDeCreacion;

    @Column(name = "fecha_de_actualizacion", nullable = false)
    private LocalDateTime fechaDeActualizacion;
}
