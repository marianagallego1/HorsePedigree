package com.udea.horsePedigree.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name="ArbolGenealogico")
public class ArbolGenealogico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idArbol;

    @Column(nullable=false, length=50)
    private int idPadre;

    @Column(nullable=false, length=50)
    private int idMadre;

    @Column(nullable=false, length=50)
    private int idAbuelo;

    @Column(nullable=false, length=50)
    private int idAbuela;

    @Column(length=1000)
    private String observacion;

    public ArbolGenealogico() {}

    public ArbolGenealogico(@JsonProperty("idArbol") int idArbol,
                            @JsonProperty("idPadre") int idPadre,
                            @JsonProperty("idMadre") int idMadre,
                            @JsonProperty("idAbuelo") int idAbuelo,
                            @JsonProperty("idAbuela") int idAbuela,
                            @JsonProperty("observacion") String observacion) {
        this.idArbol = idArbol;
        this.idPadre = idPadre;
        this.idMadre = idMadre;
        this.idAbuelo = idAbuelo;
        this.idAbuela = idAbuela;
        this.observacion = observacion;
    }
}
