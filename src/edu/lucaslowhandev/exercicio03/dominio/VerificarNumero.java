package edu.lucaslowhandev.exercicio03.dominio;

import java.util.Scanner;

public class VerificarNumero {
    public static void verificarPositivoNegativoZero(){
        Scanner sc = new Scanner(System.in);
        int numero=99;
        while (numero!=0) {
            System.out.println("Digite um numero.");
            numero = sc.nextInt();
            if (numero>0){
                System.out.println("Positivo");
            } else if (numero<0) {
                System.out.println("Negativo");
            }else {
                System.out.println("Zero");
            }
        }
    }
}
