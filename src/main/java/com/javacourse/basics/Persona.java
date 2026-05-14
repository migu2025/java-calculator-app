package com.javacourse.basics;



public class Persona {
    String nome;
    int eta;
    String lavoro;

    public Persona(String nome, int eta, String lavoro) {
        this.nome = nome;
        this.eta = eta;
        this.lavoro =lavoro;

    }

    public void saluta() {
        System.out.println("Ciao mi chiamo " + nome);
    }

    public void mostraEta(){
        System.out.println("Ho " + eta + "anni");
    }

    public void mostraLavoro(){
        System.out.println("Io lavoro come: " + lavoro);
    }
}
