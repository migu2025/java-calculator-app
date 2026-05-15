package com.javacourse.basics;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona persona1 = new Persona("Sabri Cami", 40, "RH");
        Persona persona2 = new Persona("Ver minsk", 44, "Backoffice");
        Persona persona3 = new Persona("Alice", 43, "Secretary");
        Persona persona4 = new Persona("Jacy souza", 44, "backoffice");


        ArrayList<Persona> persone = new ArrayList<>();
        persone.add(persona1);
        persone.add(persona2);
        persone.add(persona3);
        persone.add(persona4);

        int scelta;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Mostra persone");
            System.out.println("2. Cerca persona");
            System.out.println("3. Elimina persona");
            System.out.println("4. Esci");
            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:

                    System.out.println("Lista persone:");

                    for (Persona persona : persone) {
                        System.out.println(persona);
                    }
                    break;

                case 2:

                    System.out.println("Inserisci nome:");
                    String nomeRicerca = scanner.nextLine();

                    boolean trovata = false;

                    for (Persona persona : persone) {

                        if (persona.getNome().toLowerCase().contains(nomeRicerca.toLowerCase())) {
                            trovata = true;
                            System.out.println("persona trovata:");
                            System.out.println(persona);

                        }
                    }

                    if (!trovata) {
                        System.out.println("Persona non trovata");
                    }

                    break;

                case 3:

                    System.out.println("Nome da eliminare:");
                    String nomeDaEliminare = scanner.nextLine();

                    persone.removeIf(persona ->
                            persona.getNome().equalsIgnoreCase(nomeDaEliminare)
                    );

                    System.out.println("Persona eliminata");

                    break;

                case 4:

                    System.out.println("Uscita programma");

                    break;

                default:

                    System.out.println("Scelta non valida");
            }

        } while (scelta != 4);

        scanner.close();

    }
}


