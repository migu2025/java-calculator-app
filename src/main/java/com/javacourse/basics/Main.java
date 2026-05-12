package com.javacourse.basics;

public class Main {

    public static void main(String[] args) {

        int risultato = somma(5, 3);
        System.out.println(risultato);

        int moltiplicaz = moltiplica(2, 25);
        System.out.println("Il risultato è:" + moltiplicaz);

    }

    public static int somma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int moltiplica(int a, int b) {
        return a * b;
    }

}