package edu.lucaslowhandev.exercicio04.dominio;

import java.util.Scanner;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void obterInformacoes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual marcar do carro?");
        setMarca(sc.next());
        System.out.println("Qual o modelo do carro?");
        setModelo(sc.next());
        System.out.println("Qual o ano do carro?");
        setAno(sc.nextInt());
        System.out.println("Qual a cor do carro?");
        setCor(sc.next());
        sc.close();
    }
    public void informacoesDoCarro(){
        System.out.println("Marca: "+ getMarca());
        System.out.println("Modelo: "+ getModelo());
        System.out.println("Ano: "+ getAno());
        System.out.println("Cor: "+ getCor());
    }
}
