package com.udea.horsePedigree.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "rol")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rol {

    @Id
    @Column(name = "id_rol", length = 10, nullable = false)
    private String idRol;

    @Column(name = "descripcion", length = 100, nullable = false)
    private String descripcion;
}
