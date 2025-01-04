package edu.lucaslowhandev.exercicio01.test;

import edu.lucaslowhandev.exercicio01.dominio.NumeroParImpar;

import java.util.Scanner;

public class NumeroParImparTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = sc.nextInt();
        NumeroParImpar.verificarParImpar(numero);
    }
}
