package edu.lucaslowhandev.exercicio02.test;

import edu.lucaslowhandev.exercicio02.dominio.SomaNumeros;

import java.util.Scanner;

public class SomaNumerosTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero limite para somar:");
        int limite = sc.nextInt();
        SomaNumeros.somarNumeros(limite);
    }
}
