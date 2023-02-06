package com.example.interfaces;

import com.example.polimorfismo.Auto;

public class InterfacesMain {

    public static void main(String[] args) {

        AutoService service1 = new AutoServiceClassic();
        AutoService service2 = new AutoServiceSport();

        Auto auto1 = service1.crearAutoDemo();
        Auto auto2 = service2.crearAutoDemo();
    }

}
