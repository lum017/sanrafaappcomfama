package com.example.sanrafa.moldes;

public class Restaurante {

    private String nombre;
    private String ubicacion;
    private String precio;

    private String descripcion;

    public Restaurante() {
    }

    public Restaurante(String nombre, String ubicacion, String precio, String descripcion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
