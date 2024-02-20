package com.example.sanrafa.moldes;

public class sitios {
    private String nombre;
    private String nombreGuia;
    private int contacto;
    private String descripcion;
    private Integer calificacion;

    private Integer fotografia;


    public sitios() {
    }

    public sitios(String nombre, String nombreGuia, int contacto, String descripcion, Integer calificacion, Integer fotografia) {
        this.nombre = nombre;
        this.nombreGuia = nombreGuia;
        this.contacto = contacto;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
        this.fotografia = fotografia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreGuia() {
        return nombreGuia;
    }

    public void setNombreGuia(String nombreGuia) {
        this.nombreGuia = nombreGuia;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public Integer getFotografia() {
        return fotografia;
    }

    public void setFotografia(Integer fotografia) {
        this.fotografia = fotografia;
    }
}
