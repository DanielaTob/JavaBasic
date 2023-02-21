package com.example;

import java.util.Scanner;

//Ingresar y recibir datos
public class ScannerMain {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //Introducir string
        System.out.println("Introduce un nombre");
        String nombre = scanner.nextLine(); //Introducir un dato

        //Introducir numero
        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();

        System.out.println("El nombre introducido es: " + nombre);
        System.out.println("El numero introducido es: " + numero);
    }
}
