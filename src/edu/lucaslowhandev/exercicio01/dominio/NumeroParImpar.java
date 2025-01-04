package edu.lucaslowhandev.exercicio01.dominio;

public class NumeroParImpar {
    public static void verificarParImpar(int numero){
        if(numero%2==0){
            System.out.println("Número " + numero +" é par.");
        }else{
            System.out.println("Número " + numero +" é impar.");
        }
    }
}
