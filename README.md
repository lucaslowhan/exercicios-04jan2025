# Exercícios de Programação em Java

Este repositório contém uma série de exercícios de programação em Java, voltados para iniciantes. Os exercícios abordam diversos conceitos básicos, como sintaxe, condicionais, estruturas de repetição, classes, métodos e o modificador `static`. Ao realizar esses exercícios, você vai desenvolver habilidades essenciais para escrever programas em Java.

## Exercícios

### 1. Verificação de Número Par ou Ímpar
**Objetivo:** Criar um programa que leia um número e determine se ele é par ou ímpar.

**Instruções:**
- Crie uma classe chamada `NumeroParImpar`.
- Dentro da classe, crie um método `verificarParImpar(int numero)` que, se o número for par, imprima "O número é par", caso contrário, imprima "O número é ímpar".
- No método `main`, solicite ao usuário para digitar um número e passe-o para o método `verificarParImpar`.

**Exemplo de Entrada:**
- Entrada: 7
- Saída: O número é ímpar

---

### 2. Soma de Números até um Limite
**Objetivo:** Criar um programa que some todos os números de 1 até um número limite dado pelo usuário.

**Instruções:**
- Crie uma classe chamada `SomaNumeros`.
- Crie um método `somarNumeros(int limite)` que soma todos os números de 1 até o número `limite` e imprime o resultado.
- No método `main`, solicite ao usuário para digitar o número limite e chame o método `somarNumeros`.

**Exemplo de Entrada:**
- Entrada: 5
- Saída: A soma dos números de 1 até 5 é 15

---

### 3. Estrutura de Repetição com Condicional
**Objetivo:** Criar um programa que leia números até que o número zero seja digitado e, para cada número, imprima se ele é positivo, negativo ou zero.

**Instruções:**
- Crie uma classe chamada `VerificarNumero`.
- Dentro da classe, crie um método `verificarPositivoNegativoZero()` que leia números e imprima a classificação ("Positivo", "Negativo" ou "Zero") até que o número zero seja digitado.
- Use um `while` ou `do-while` para a repetição.

**Exemplo de Entrada:**
- Entrada: 3, -2, 0
- Saída: Positivo, Negativo, Zero

---

### 4. Classe `Carro` com Métodos
**Objetivo:** Criar uma classe `Carro` com atributos e métodos para simular o comportamento de um carro.

**Instruções:**
- Crie uma classe chamada `Carro` com os seguintes atributos:
    - `marca` (String)
    - `modelo` (String)
    - `ano` (int)
    - `cor` (String)
- Crie um método chamado `informacoesDoCarro()` que imprime todas as informações do carro.
- No método `main`, crie uma instância da classe `Carro`, defina os valores dos atributos e chame o método `informacoesDoCarro`.

**Exemplo de Entrada:**
- Saída: "Marca: Toyota, Modelo: Corolla, Ano: 2022, Cor: Azul"

---

### 5. Contador de Instâncias de uma Classe com `static`
**Objetivo:** Criar uma classe com um contador de instâncias usando o modificador `static`.

**Instruções:**
- Crie uma classe chamada `ContaInstancias` com um atributo estático `contador` que armazena o número de instâncias da classe.
- No construtor da classe, incremente o contador sempre que uma nova instância for criada.
- Crie um método estático `obterContador()` que retorna o valor atual do contador.
- No método `main`, crie algumas instâncias da classe e imprima o valor do contador de instâncias.

**Exemplo de Entrada:**
- Saída: "Número de instâncias criadas: 3"

---

## Como Rodar os Exercícios

1. Clone este repositório para a sua máquina local:

    ```bash
    git clone https://github.com/lucaslowhan/exercicios-04jan2025.git
    ```

2. Navegue até a pasta do repositório:

    ```bash
    cd exercicios-fixacao-04jan25.edu.lucaslowhandev
    ```

3. Abra o arquivo de código desejado em sua IDE ou editor de texto preferido e execute os programas.

## Tecnologias Utilizadas
- Java 8 ou superior

## Contribuições

Sinta-se à vontade para contribuir com melhorias ou correções! Para contribuir:

1. Faça o **fork** deste repositório.
2. Crie uma **branch** para sua alteração (`git checkout -b feature/exemplo`).
3. Faça as modificações necessárias.
4. Envie um **pull request** para que suas alterações sejam revisadas.
