package com.javacourse.basics;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Sabri Cami", 40, "RH");
        Persona persona2 = new Persona("Ver minsk", 44, "Backoffice");
        Persona persona3 = new Persona("Alice", 43, "Secretary");


        ArrayList<Persona> persone = new ArrayList<>();
        persone.add(persona1);
        persone.add(persona2);
        persone.add(persona3);

        for (Persona persona : persone) {
            persona.saluta();
            persona.mostraEta();
            persona.mostraLavoro();
        }


    }


}