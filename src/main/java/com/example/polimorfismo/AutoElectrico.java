package com.example.polimorfismo;

public class AutoElectrico  extends Auto {

    String motorElectrico;

    public AutoElectrico(){

    }

    public AutoElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    public AutoElectrico(String color, String marca, String modelo, Double peso, Double largo, String motorElectrico){
        super(color, marca, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    @Override //Anotacion - Sobre escritura de metodos
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "AutoElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
