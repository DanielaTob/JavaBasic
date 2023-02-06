package com.example.conceptos;

public class Funciones {

    public static void main(String[] args) {
        saludo();
        saludo("Luke");
        saludo("Leia");
        System.out.println(devolverSaludo());
    }

    //Agrupacion de sentencias que pueden ser reutilizadas
    private static void saludo(){
        System.out.println("Hello World");
    }

    private static void saludo(String name){
        System.out.println("Hello World " + name);
    }

    private static String devolverSaludo(){
        return "Hola";
    }
}
