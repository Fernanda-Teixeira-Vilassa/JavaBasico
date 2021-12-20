package com.company;

public class TesteCategoria {
    public static void main(String[] args) {
        int idade = 18;
        String categoria;
        System.out.println("Teste Categoria");

        if (idade <= 16) {
            categoria = "Infantil";
        } else {
            if (idade < 18) {
                categoria = "Juvenil";
            } else {
                categoria = "Adulto";
            }
            System.out.println(categoria);
        }
    }
}
