package com.example.conceptos;

public class SwitchCase {

    public static void main(String[] args) {

        String weather = "cloudy";

        switch (weather){
            case "sunny":
                System.out.println("Soleado");
                break;
            case "cloudy":
                System.out.println("Nublado");
                break;
            default:
                System.out.println("No se ha encontrado el caso solicitado");
        }
    }
}
