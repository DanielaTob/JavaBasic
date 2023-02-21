package com.example;

import java.util.HashMap;
import java.util.Map;

//Hace parte de las ESTRUCTURAS DE DATOS
public class MapMain {

    public static void main(String[] args) {

        //Se utiliza la interface Map
        // Mapas de clave - valor
        Map<String, String> personas = new HashMap<>();

        //"clave", "valor"
        personas.put("123456", "Nombre Apellido 1");
        personas.put("837367", "Nombre Apellido 2");
        personas.put("265170", "Nombre Apellido 3");

        System.out.println(personas);

        //FORMAS DE ITERAR SOBRE LOS MAPAS

        //Imprime solo las claves
        for (String key : personas.keySet()){
            System.out.println(key);
        }

        //Imprime solo los valores
        for (String value : personas.values()) {
            System.out.println(value);
        }

        //Imprime ambos
        for (Map.Entry<String, String> pair : personas.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }
}
