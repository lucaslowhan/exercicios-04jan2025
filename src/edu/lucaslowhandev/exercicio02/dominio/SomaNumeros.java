package edu.lucaslowhandev.exercicio02.dominio;

public class SomaNumeros {
    public static void somarNumeros(int limite){
        int soma=0;
        for(int i=1;i<=limite;i++){
            soma+=i;
        }
        System.out.println("A soma dos números de 1 até " + limite + " é " + soma);
    }
}
