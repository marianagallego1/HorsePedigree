package com.udea.horsePedigree.DTO;

public class EquinoDTO {

    private int idEquino;

    private String nombre;

    private String apellido;

    private String tipoDeSangre;

    /*private String idTipoDePaso;*/

    private String estaVivo;

    /*private String fechaDeNacimiento;

    private String fechaDeFallecimiento;

    private String idPropietario;*/

    private String observacion;

    /*private String idAbol;*/

    private String urlFoto;

    /*private String fechaDeCreacion;

    private String fechaDeActualizacion;*/

    private String genero;

    private String idChip;

    public EquinoDTO(){}

    public EquinoDTO(int idEquino, String nombre, String apellido, String tipoDeSangre, String estaVivo, String observacion, String urlFoto, String genero, String idChip) {
        this.idEquino = idEquino;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDeSangre = tipoDeSangre;
        this.estaVivo = estaVivo;
        this.observacion = observacion;
        this.urlFoto = urlFoto;
        this.genero = genero;
        this.idChip = idChip;
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
