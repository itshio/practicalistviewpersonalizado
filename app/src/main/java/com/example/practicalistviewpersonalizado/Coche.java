package com.example.practicalistviewpersonalizado;

/**
 * Created by DIDACT on 30/01/2018.
 */

public class Coche {

    String marca;
    String modelo;
    String imagen;
    double precio;

    public Coche(String marca, String modelo, String imagen, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.imagen = imagen;
        this.precio = precio;


    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}



