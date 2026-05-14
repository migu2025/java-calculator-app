package com.javacourse.basics;



public class Persona {
    private String nome;
    private int eta;
    private String lavoro;

    public String getLavoro() {
        return lavoro;
    }

    public void setLavoro(String lavoro) {
        this.lavoro = lavoro;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



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
