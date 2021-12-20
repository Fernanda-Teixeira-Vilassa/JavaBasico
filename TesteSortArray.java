package com.company;
/*Importante: Definição da classe java.util.* para a utilização do método Array.sort */
import java.util.*;

public class TesteSortArray {
    /*Objetivo: Classificação dos elementos númericos de uma array, utilizando o método Array.sort
    * da classe java.util.* */

    //Método principal
    public static void main(String[] args) {

        /*Definição dos valores númericos de uma array unidimensional */
        int idx [] = {2, 1, 9, 6, 4};

        /*Apresentação dos valores de um array ANTES da classificação */
        System.out.println("Valores de uma array para ORDENAR: ");
        for (int valor : idx)   {
            System.out.println(valor + "\t");
        }
        /*Sobra a sintaxe -> for (valor : idx) {}
        * A Variaável valor, declarada internamente na estrutura do for deve ser definida com o mesmo tipo
        * que os dados do array (idx), neste caso está comp int. Ela faz parte do loop e a informação armazenada
        * em valor será o elemento atual do próprio array. A expressão lógica é o próprio array envolvido no loop.
        * A sintaxe comum do laço for é:
        * for (inicilização; condição; incremento ou decremento) {conteúdo} */

        /*Execução do método sort para classificação do array */
        Arrays.sort(idx);

        /* Impressão com quebra de linha*/
        System.out.println("  ");

        /*Apresentação dos valores númericos Ordenados de uma array utilizando o método sort */
        System.out.println("Valores de uma array Ordenado: ");
        for (int valor : idx)   {
            System.out.println(valor + "\t");
        }
        /* Impressão com quebra de linha*/
        System.out.println("  ");
}
}
