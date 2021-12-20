package com.company;

public class MathExemplos2 {
    public static void main(String[] args) {
        /*Definição de um número real*/
        double num = 90;

        /*Cálculo e apresentação da raiz quadrada de um número real utilizando a classe Math*/
        System.out.println("sqrt: Raiz quadrada de " + num + " = " + Math.sqrt(num));

        /*Cálculo da raiz qudrada de um número real com arrendondamento a classe Math*/
        System.out.println("round: O valor arrendondado da raiz quadrada de " + num + " = " + Math.round(Math.sqrt(num)));
    }
}
