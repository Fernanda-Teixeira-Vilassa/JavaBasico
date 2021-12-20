package com.company;

public class MathExemplo3 {
    /*Calcular a Exponenciação e também a Potenciação de um número inteiro utilizando a class Math
    * e respectivamente os métodos: Math.exp e Math.pow*/
    public static void main(String[] args) {
        /*Definição de um número inteiro*/
        int num = 2;

        /*Apresentação da Exponenciação de um número inteiro elevado ao quadrado, utilizando o método exp
        * da classe Math*/
        System.out.println("exp: Valor de E elevado ao quadrado: " + Math.exp(2));
        /*Apresentação da Potenciação de um número inteiro elevado à quarta, utilizando o método pow da
        classe Math*/
        System.out.println("pow: " + num + " - elevado a quarta = " + Math.pow(num,4));
    }
}
