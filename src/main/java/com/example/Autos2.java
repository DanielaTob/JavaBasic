package com.example;

public class Autos2 {

    String name = "Nombre auto";

    public Autos2(){

    }

    public Autos2(String name){
        this.name = name;
    }

    //Metodo para que se impriman los valores,
    // si no lo tenemos solo se imprime la referencia en memoria
    @Override
    public String toString() {
        return "Autos2{" +
                "name='" + name + '\'' +
                '}';
    }
}
