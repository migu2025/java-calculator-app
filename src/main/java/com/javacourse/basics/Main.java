package com.javacourse.basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCOLATRICE JAVA ===");

        System.out.println("Inserisci il primo numero:");
        double numero1 = scanner.nextDouble();

        System.out.println("Inserisci il secondo numero:");
        double numero2 = scanner.nextDouble();

        System.out.println("Scegli l'operazione:");
        System.out.println("1 per somma");
        System.out.println("2 per sottrazione");
        System.out.println("3 per moltiplicazione");
        System.out.println("4 per divisione");

        int opzione = scanner.nextInt();

        switch (opzione) {

            case 1:
                System.out.println("Somma: " + (numero1 + numero2));
                break;

            case 2:
                System.out.println("Sottrazione: " + (numero1 - numero2));
                break;

            case 3:
                System.out.println("Moltiplicazione: " + (numero1 * numero2));
                break;

            case 4:
                if (numero2 != 0) {
                    System.out.println("Divisione: " + (numero1 / numero2));
                } else {
                    System.out.println("Errore: divisione per zero!");
                }
                break;

            default:
                System.out.println("Operazione non valida");
        }

        scanner.close();
    }
}