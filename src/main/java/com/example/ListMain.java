package com.example;


import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        //Lista dinamica de strings
        List<String> nombres = new ArrayList<>();

        //Le agregamos elementos
        nombres.add("Daniela");
        nombres.add("Daniela 1");
        nombres.add("Daniela 2");
        nombres.add("Daniela 3");

        System.out.println(nombres);

        for (String nombre : nombres) {
            System.out.println(nombre);
        }


        List<Autos2> autos = new ArrayList<>();

        autos.add(new Autos2("Honda"));
        autos.add(new Autos2("Mazda"));
        autos.add(new Autos2("Kia"));

        System.out.println(autos);

        for (Autos2 AutosNew: autos) {
            System.out.println(AutosNew);
        }

    }
}
