package com.example.interfaces;

import com.example.polimorfismo.Auto;
import com.example.polimorfismo.AutoElectrico;

public class AutoServiceSport implements AutoService {


    @Override
    public Auto crearAutoDemo() {
        System.out.println("Creando auto deportido...");
        return new AutoElectrico();
    }

}
