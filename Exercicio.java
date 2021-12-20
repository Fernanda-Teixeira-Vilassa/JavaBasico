package com.company;

public class Exercicio {
    public static void main(String[] args) {
        String [][] nome = new String[2][2];
        nome [0][0] = "Adriana";
        nome [0][1] = "Fernanda";
        nome [1][0] = "Leticia";
        nome [1][1] = "Gustavo";

        for (int l=0; l< nome.length; l++)  {
            for (int c=0; c< nome.length; c++)  {
                System.out.println(1 + " e " + c + " = " + nome[1][c] + "\t");
            }
            System.out.println("\n");
        }
    }
}
