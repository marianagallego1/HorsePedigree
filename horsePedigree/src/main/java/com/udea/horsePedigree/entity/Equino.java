package com.udea.horsePedigree.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name="Equino")
public class Equino {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEquino;

    @Column(nullable=false, length=50)
    private String nombre;

    @Column(nullable=false, length=50)
    private String apellido;

    @Column(nullable=false, length=3)
    private String tipoDeSangre;

    /*@Column(nullable=false, length=50)
    private String idTipoDePaso;*/

    @Column(nullable=false, length=10)
    private String estaVivo;

    /*@Column(nullable=false, length=50)
    private String fechaDeNacimiento;

    @Column(nullable=false, length=50)
    private String fechaDeFallecimiento;

    @Column(nullable=false, length=50)
    private String idPropietario;*/

    @Column(length=1000)
    private String observacion;

    /*@Column(nullable=false, length=50)
    private String idAbol;*/

    @Column(nullable=false, length=1000)
    private String urlFoto;

    /*@Column(nullable=false, length=50)
    private String fechaDeCreacion;

    @Column(nullable=false, length=50)
    private String fechaDeActualizacion;*/

    @Column(nullable=false, length=1)
    private String genero;

    @Column(nullable=false, length=50)
    private String idChip;


    public Equino(){}

    @JsonCreator
    public Equino(@JsonProperty("idEquino") int idEquino,
                  @JsonProperty("nombre") String nombre,
                  @JsonProperty("tipoDeSangre") String tipoDeSangre,
                  @JsonProperty("estaVivo") String estaVivo,
                  @JsonProperty("observacion") String observacion,
                  @JsonProperty("urlForo") String urlFoto,
                  @JsonProperty("genero") String genero) {
        this.idEquino = idEquino;
        this.nombre = nombre;
        this.tipoDeSangre = tipoDeSangre;
        this.estaVivo = estaVivo;
        this.observacion = observacion;
        this.urlFoto = urlFoto;
        this.genero = genero;
    }


    public int getIdEquino() {
        return idEquino;
    }

    public void setIdEquino(int idEquino) {
        this.idEquino = idEquino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public String getEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(String estaVivo) {
        this.estaVivo = estaVivo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdChip() {
        return idChip;
    }

    public void setIdChip(String idChip) {
        this.idChip = idChip;
    }
}
