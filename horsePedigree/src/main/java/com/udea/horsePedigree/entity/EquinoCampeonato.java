package com.udea.horsePedigree.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "equino_campeonato")
@Getter
@Setter
public class EquinoCampeonato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equino_campeonato")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_equino", nullable = false)
    private Equino equino;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id_campeonato", nullable = false)
    private Campeonato campeonato;

    @Column(nullable = false)
    private int puntaje;

    @Column(length = 50, nullable = false)
    private String resultado;

    @Column(length = 100)
    private String procedencia;
}
