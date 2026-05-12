package com.javacourse.basics;

public class Main {

    public static void main(String[] args) {
        int[] numeri = {10, 20, 30, 40, 50};
        String[] nome = {"Jacy", "Sabri", "Ver", "Alice", "Linda"};

        for (int i : numeri) {
            System.out.print(i + " ");

        }
        for (String n : nome) {
            System.out.println(n);
        }
        System.out.println(numeri[0]);
        System.out.println(numeri[4]);

    }

}