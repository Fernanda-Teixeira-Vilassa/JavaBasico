package com.company;
//Transferir os conteúdos de um array NOMECURSO para outro array CODCURSO com as mesmas caractéristicas
// e propriedades, mas com tamanhos diferentes, utilizando o método arraycopy
public class ExemploArrayCopy {
    public static void main(String[] args) {
    //Entrada e Processamento de dados
    /*Array unidimensional NOMECURSO com tamanho de 7 elementos [0] a [6]*/
        char [] NOMECURSO = {'S', 'I', 'S', 'T', 'E', 'M', 'A'};
    /*Array unidimensional CODCURSO com tamanho de elementos [0] a [3]*/
        char [] CODCURSO = new char[4];

    /*Transferência do conteúdo entre os arrays utilizando o método arraycopy*/
        System.arraycopy(NOMECURSO,0, CODCURSO,0,4);

    /*Saída de dados*/
    /* Apresentação do resultado do processmaneto*/
        System.out.println(new String(CODCURSO));

    }
}




