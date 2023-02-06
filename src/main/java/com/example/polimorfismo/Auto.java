package com.example.polimorfismo;

public class Auto {

    //atributos
    String color;
    String marca;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    //constructores
    public Auto(){

    }
    public Auto(String color, String marca, String modelo, Double peso, Double largo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }


    //comportamientos
    public void acelerar(Integer cantidad){
        if (cantidad > 0 && cantidad <= 120)
        this.velocidad += cantidad;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
