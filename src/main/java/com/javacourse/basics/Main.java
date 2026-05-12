package com.javacourse.basics;

public class Main {

    public static void main(String[] args) {
        int[] numeri = {10, 20, 30, 40, 50};
        int massimo = numeri[0];
        for (int numero : numeri) {
            if(numero > massimo) {
                massimo = numero;
            }
        }
        System.out.println("il numero piu grande e: " + massimo);


//        System.out.println(numeri[0]);
//        System.out.println(numeri[4]);

    }



}