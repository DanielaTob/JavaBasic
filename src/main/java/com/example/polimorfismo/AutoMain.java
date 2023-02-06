package com.example.polimorfismo;

public class AutoMain {

    public static void main(String[] args) {

        Auto cocheObj = new AutoElectrico();

        //Objeto - Instancia de una clase
        Auto cocheObj2 = new AutoElectrico("verde", "honda", "civic", 1430.45, 5.4, "motor electrico");

        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        cocheObj2.peso = 1350.8;

        System.out.println(cocheObj2);

        AutoElectrico autoElectrico = new AutoElectrico();
        autoElectrico.motorElectrico = "Ejemplo motor electrico...";
        autoElectrico.color = "rojo";
        autoElectrico.marca = "bmw";
        autoElectrico.modelo = "nuevo";

        System.out.println(autoElectrico);

        AutoHibrido autoHibrido = new AutoHibrido();
        autoHibrido.motorHibrido = "Ejemplo motor hibrido...";
        autoElectrico.color = "verde";
        autoElectrico.marca = "mazda";
        autoElectrico.modelo = "old";

        System.out.println(autoHibrido);

        AutoElectrico autoElectrico2 = new AutoElectrico("azul", "alfa", "romeo", 1500d, 4.99, "Motor super electrico...");
        System.out.println(autoElectrico2);

        autoElectrico2.acelerar(50);
        System.out.println(autoElectrico2);


    }
}
