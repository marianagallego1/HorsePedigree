package com.udea.horsePedigree.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "arbol_genealogico")
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ArbolGenealogico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_arbol")
    private int idArbol;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_padre")
    private Equino padre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_madre")
    private Equino madre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_abuelo_paterno")
    private Equino abueloPaterno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_abuela_paterna")
    private Equino abuelaPaterna;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_abuelo_materno")
    private Equino abueloMaterno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_abuela_materna")
    private Equino abuelaMaterna;

    @Column(length = 1000)
    private String observacion;
}
