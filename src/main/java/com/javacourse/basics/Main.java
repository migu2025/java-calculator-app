package com.javacourse.basics;

public class Main {

    public static void main(String[] args) {
        int[] numeri = {10, 20, 30, 40, 50};
        int contatorePari = 0;
        int ispari = numeri[0];
        for (int numero : numeri) {
            if (numero % 2 == 0) {
                contatorePari++;

            }
        }

        System.out.println("il totale di numeri pari sono: " + contatorePari);

//        System.out.println(numeri[0]);
//        System.out.println(numeri[4]);

    }


}