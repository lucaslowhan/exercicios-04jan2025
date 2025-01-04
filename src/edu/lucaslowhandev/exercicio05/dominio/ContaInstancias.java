package edu.lucaslowhandev.exercicio05.dominio;

public class ContaInstancias {
    private String nome;
    public static int contador;

    public ContaInstancias(String nome){
        this.nome = nome;
        contador++;
    }
    public static void obterContador(){
        System.out.println(contador);
    }
}
