package com.company;

public class ExemplosMatriz {
    //Leitura das 4 notas e apresentação da média de cada disciplina
    public static void main(String[] args) {

        //Entrada de dados e definição das variáveis

        //Array unidimensional para armazenamento dos nomes das 2 disciplinas
        String[] cursos;
        cursos = new String[2];
        cursos[0] = "Sistemas";
        cursos[1] = "Internet";

        //Array multimensional para armazenamento das 4 notas de cada disciplina
        double[][] notas = new double[2][4];
        notas[0][0] = 8.0;
        notas[0][1] = 7.5;
        notas[0][2] = 9.0;
        notas[0][3] = 8.5;
        notas[1][0] = 9.5;
        notas[1][1] = 8.5;
        notas[1][2] = 8.0;
        notas[1][3] = 9.0;

        //Definição da variável fracionaria média para armazenamento da média
        double media = 0.0;

        //Processamento de dados
        //Label (rotulo) para salto simples de linha e do título "Média"
        System.out.println("\n");
        System.out.println("MEDIAS: ");

        //Controle de busca por disciplina através da variável 1
        for (int l=0; l< notas.length; l++)     {
            //Controle de busca das 4 notas de cada disciplina através da variável c
            for (int c=0; c<notas[0].length; c++)   {
            //Acumulador das 4 notas de cada disciplina na variável média
                media = media + notas[0][c];
            }

            //Calculo aritmetico da variável média acumulada por disciplina
            media = media/4;

            /*Saida de dados*/
            //Apresentação do resultado após o processamento com concatenação de string e variaveis
            System.out.println(cursos[0] + " = " + media);
            media = 0;
        }
        System.out.println("\n");
    }
}
