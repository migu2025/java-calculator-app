package com.javacourse.basics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String>nomi = new ArrayList<>();
        nomi.add("Ver");
        nomi.add("Alice");
        nomi.add("Linda");
        nomi.add("sami");

        for(String name: nomi){
            System.out.println(name);
        }


    }


}