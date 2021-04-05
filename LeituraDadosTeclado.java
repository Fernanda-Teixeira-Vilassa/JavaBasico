package fernandavilassa.cursojavabasico;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /*
        //Leitura da linha toda
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é " + nomeCompleto);
        
        //Leitura do primeiro nome  
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu nome é " + primeiroNome);
        
        //Leitura de variavel inteira
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é " + idade);
        
        //Leitura da variavel ponto flutuante
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é " + altura);
        */
       
       //Leitura de varios dados
       System.out.println("Digite seu nome, idade, altura, estado civil e se tem filhos e quantos:");
       String nome = scan.next();
       int idade = scan.nextInt();
       double altura = scan.nextDouble();
       String estCivil = scan.next();
       boolean filhos = scan.nextBoolean();
       int quantfilhos = scan.nextInt();
       System.out.println("Você informou: ");
       System.out.println("Seu nome é " + nome);
       System.out.println("Sua idade é " + idade);
       System.out.println("Sua altura é " + altura);
       System.out.println("Seu estado civil é " + estCivil);
       System.out.println("Tenho filhos: " + filhos);
       System.out.println("Tenho " + quantfilhos + " filhos.");
       
    }
 
}
