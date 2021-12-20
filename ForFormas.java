package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class ForFormas {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------");
        System.out.println("  ");
        System.out.println("Forma 1: Valor inicial para x=10 declarado externamente");
        int x=10;

        for (; x <=20; x++){
            System.out.println("Intevalo aleatorio e fracionario para x entre 10 e 20: " + Math.random()*x);
        }

        System.out.println("--------------------------------------------");
        System.out.println("  ");
        System.out.println("Forma 2: Condicional controlada no final do loop po if x>25");

        for (x=20; ; x++)   {
            System.out.println("Intevalo aleatorio e fracionario para x entre 20 e 25: " + Math.random()*x);
            if (x>25) break;
        }
        System.out.println("_______________________________________________");
        System.out.println("  ");
        System.out.println("Forma 3: Incremento controlado no acumular de com x++");

        for (x=1; x <=10;)  {
            System.out.println("Intevalo aleatorio e fracionario para x entre 1 a 10: " + Math.random()*x);
            x++;
        }

        System.out.println("-----------------------------------------------");
        System.out.println("  ");
        System.out.println("Forma 4: Aninhamento de For para os acumuladores X e Y");
        int y=1;

        for (x=1; x<=10; x++)   {
            for (; y<=5; y++)   {
                System.out.println(" Valor incrementado de 1 em 1 para y entre 1 e 5: " + y);
            }
            System.out.println("Intervalo aleatorio e fracionario para x entre 1 e 10: " + Math.random()*x);
        }

        System.out.println("________________________________________________");
        System.out.println("  ");
        System.out.println("Forma 5: Decremento de 5 em 5 para x");

        for (x=50; x>=5; x-=5)  {
            System.out.println("Valor decresente de 5 em 5 para x entre 50 e 5: " + x);
        }
    }
}
