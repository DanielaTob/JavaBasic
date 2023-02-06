package com.example.interfaces;

import com.example.polimorfismo.Auto;
import com.example.polimorfismo.AutoElectrico;

public class AutoServiceClassic  implements AutoService {


    @Override
    public Auto crearAutoDemo() {
        System.out.println("Creando auto clasico...");
        return new AutoElectrico();
    }
}
