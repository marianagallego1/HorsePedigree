package com.udea.horsePedigree.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tipo_de_paso")
@Getter
@Setter
public class TipoDePaso {

    @Id
    @Column(name = "id_tipo_de_paso", nullable = false, length = 10)
    private String idTipoDePaso;

    @Column(nullable = false, length = 50)
    private String descripcion;
}
