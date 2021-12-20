package com.company;
import java.util.*;

public class Cores {
    public static void main(String[] args) {
        String [] cores = new String [5];
        cores [0] = "Azul";
        cores [1] = "Verde";
        cores [2] = "Amarelo";
        cores [3] = "Vermelho";
        cores [4] = "Branco";

        Arrays.sort(cores);

        for (String valor: cores)   {
            System.out.println(valor + "\t");
        }
    }
}
