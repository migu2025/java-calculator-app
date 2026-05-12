package com.javacourse.basics;

public class Main {

    public static void main(String[] args) {


        String[] nomi = {"Jacy", "Sabri", "Ver", "Alice"};

        String nomeDaCercare = "Linda";

        boolean trovato = false;

        for (String nome : nomi) {

            if (nome.equals(nomeDaCercare)) {

                trovato = true;

            }
        }

        System.out.println("Nome trovato? " + trovato);

    }


}