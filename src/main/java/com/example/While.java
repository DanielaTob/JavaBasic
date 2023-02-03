package com.example;

public class While {

    public static void main(String[] args) {

        boolean check = true;
        int count = 0;

        while(count < 10){

            count++; //condicion
            if (count == 6){
                //continue; //salta el valor 6 y continua a la siguiente ejecucion
                break; //Rompe el flujo de ejecucion
            }
            System.out.println("Hola mundo " + count);

        }
        System.out.println("fin...");
    }
}
