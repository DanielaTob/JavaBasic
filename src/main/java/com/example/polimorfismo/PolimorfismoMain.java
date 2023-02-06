package com.example.polimorfismo;

public class PolimorfismoMain {

    public static void main(String[] args) {


        Auto auto1 = new Auto();

        AutoElectrico auto2 = new AutoElectrico();

        AutoHibrido auto3 = new AutoHibrido();
        
        //Polimorfismo
        Auto auto4 = new AutoElectrico();
        
        Auto auto5 = new AutoHibrido();

        if (auto4 instanceof Auto){
            System.out.println("Auto...");
        }

        if (auto4 instanceof AutoElectrico){
            System.out.println("Auto Electrico...");
        }

        if (auto4 instanceof AutoHibrido){
            System.out.println("Auto Hirbrido...");
        }
        
        
    }
}
