package edu.lucaslowhandev.exercicio05.test;

import edu.lucaslowhandev.exercicio05.dominio.ContaInstancias;

public class ContaInstanciasTest {
    public static void main(String[] args) {
        ContaInstancias a = new ContaInstancias("ContadorA");
        ContaInstancias b = new ContaInstancias("ContadorB");
        ContaInstancias c = new ContaInstancias("ContadorC");
        ContaInstancias.obterContador();
    }
}
