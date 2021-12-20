package com.company;

public class Media {
    public static void main(String[] args) {
        int nota1 = 10;
        int nota2 = 6;
        int nota3 = 5;
        int media = (nota1 + nota2 + nota3) / 3;

        String status;

        if (media >= 6) {
            status = "Aprovado";
        } else {
            status = "Reprovado";
        }
        System.out.println(media);
        System.out.println(status);
    }
}
