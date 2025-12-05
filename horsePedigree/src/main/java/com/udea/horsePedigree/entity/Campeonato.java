package com.udea.horsePedigree.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "campeonato")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Campeonato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_campeonato")
    private Integer idCampeonato;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 150)
    private String ubicacion;

    @Column(nullable = false, length = 1000)
    private String descripcion;

    @Column(name = "nivel_de_campeonato", nullable = false, length = 50)
    private String nivelDeCampeonato;

    @Column(name = "fecha_campeonato")
    private LocalDate fechaCampeonato;
}
