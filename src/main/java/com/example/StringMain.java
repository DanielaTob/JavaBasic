package com.example;

public class StringMain {

    public static void main(String[] args) {

        //La clase String

        String mensaje = "  Hola mundo  ";
        System.out.println(mensaje.length()); //calcular la longitud

        String mensajeMAY = mensaje.toUpperCase(); //devuelve texto en mayuscula
        System.out.println(mensajeMAY);
        System.out.println(mensajeMAY.trim()); //remover los espacios del string
        mensajeMAY = mensajeMAY.trim();

        String comparacion = "HOLA MUNDO";
        if (mensajeMAY.equals(comparacion)){ //comparacion
            System.out.println("verdadero!!");
        }
    }
}
