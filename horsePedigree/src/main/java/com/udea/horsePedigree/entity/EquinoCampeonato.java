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
    private Integer idEquinoCampeonato ;

    @ManyToOne
    @JoinColumn(name = "id_equino", nullable = false)
    private Equino Equino;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria Categoria;

    @ManyToOne
    @JoinColumn(name = "id_campeonato", nullable = false)
    private Campeonato Campeonato;

    @Column(nullable = false)
    private int puntaje;

    @Column(length = 50, nullable = false)
    private String resultado;

    @Column(length = 100)
    private String procedencia;
}
