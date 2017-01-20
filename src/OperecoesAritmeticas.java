/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * *********************************************************
 */
/* PI - PROCESSAMENTO DE IMAGNES                            */
/* UFT - UNIVERSIDADE FEDERAL DO TOCANTINS 2015             */
/* PROFESSOR: GLENDA BOTELHO                                */
/* SEGUNDO TRABALHO                                         */
/* TAYLA SOUSA                                              */
/* SARA FERNANDES                                           */
/* DATA DE ENTREGA : 24/11/2015                             */
/*                                                          */
/**
 * *********************************************************
 */
public class OperecoesAritmeticas {
    
    public static void main(String[] args) throws Exception {

        // Inicializa matrizes de pixels da classe 4x4
        int[][] matrizA = new int[4][4];

        matrizA[0][0] = 2;
        matrizA[0][1] = 0;
        matrizA[0][2] = 4;
        matrizA[0][3] = 5;

        matrizA[1][0] = 6;
        matrizA[1][1] = 4;
        matrizA[1][2] = 1;
        matrizA[1][3] = 2;

        matrizA[2][0] = 50;
        matrizA[2][1] = 0;
        matrizA[2][2] = 3;
        matrizA[2][3] = 12;

        matrizA[3][0] = 20;
        matrizA[3][1] = 40;
        matrizA[3][2] = 40;
        matrizA[3][3] = 20;

        int[][] matrizB = new int[4][4];

        matrizB[0][0] = 10;
        matrizB[0][1] = 34;
        matrizB[0][2] = 21;
        matrizB[0][3] = 12;

        matrizB[1][0] = 10;
        matrizB[1][1] = 34;
        matrizB[1][2] = 21;
        matrizB[1][3] = 12;

        matrizB[2][0] = 10;
        matrizB[2][1] = 34;
        matrizB[2][2] = 21;
        matrizB[2][3] = 12;

        matrizB[3][0] = 10;
        matrizB[3][1] = 34;
        matrizB[3][2] = 21;
        matrizB[3][3] = 12;

        //Criando classe para usar os métodos 
        OperecoesAritmeticas matrizes = new OperecoesAritmeticas();
        
        //Realiza Soma
        int[][] soma = matrizes.somaMatrizes(matrizA, matrizB);

        //Realiza Subtração
        int[][] subtrai = matrizes.subtraiMatrizes(matrizA, matrizB);
        
  System.out.println("---Matrizes Resultantes - SOMA e SUBTRAÇÃO---");
  System.out.println("");
        //mostrando resultado
        matrizes.mostrarMatriz(soma);
        
        //mostrando resultado
        matrizes.mostrarMatriz(subtrai);
        
        //ShowA matriz
        matrizes.mostrarMatriz(matrizA);
        
        //ShowB matriz
        matrizes.mostrarMatriz(matrizB);

    }
    
    

    //Show a matriz
    private void mostrarMatriz(int[][] matriz) {
        
        int lar = matriz.length;
    int alt = matriz[0].length;
        //Varrendo todas as linhas
        for (int x = 0; x < lar; x++) {
            //Varrendo todas as colunas
            for (int y = 0; y < alt; y++) {
                //Escrever o conteúdo da linha X e as conlunas Y
                System.out.print(matriz[x][y] + " ");
            }

            //Pular uma linha em branco toda vez que for imprimir uma linha nova da matriz
            System.out.println("");
        }

        //Pular uma linha em branco
        System.out.println("");
    }

    private void verificaTamanhoMatriz(int[][] matA, int[][] matB) throws Exception {
        //Verificar se elas são de mesmo tamanho
        if (matA.length != matB.length || matA[0].length != matB[0].length) {
            //Senão, ativar erro para quem chamou esse método
            throw new Exception("ERRO: Matrizes de tamanhos diferentes");
        }

    }
    

    //Operação com Matrizes
    private int[][] somaMatrizes(int[][] matA, int[][] matB) throws Exception {

        verificaTamanhoMatriz(matA, matB);
        //Criando o resultado do mesmo tamanho da matriz que será somada
       
        int[][] resultado = new int[matA.length][matA[0].length];

        //Varrer todas as linhas
        for (int x = 0; x < resultado.length; x++) {
            for (int y = 0; y < resultado[0].length; y++) {

                //Somar mesma posicao das matrizes e colocar na mesma posicao no resultado
                //A operação de soma resulta na média aritmética entre as n imagens utilizadas ⇒ redução ruídos.
                resultado[x][y] = (matA[x][y] + matB[x][y])/2;

            }
           
        }

        //Retorna o resultado
        return resultado;
    }

    private int[][] subtraiMatrizes(int[][] matA, int[][] matB) throws Exception {

        verificaTamanhoMatriz(matA, matB);
        //Criando o resultado do mesmo tamanho da matriz que será subtraida
       
        int[][] resultado = new int[matA.length][matA[0].length];

        //Varrer todas as linhas
        for (int x = 0; x < resultado.length; x++) {
            for (int y = 0; y < resultado[0].length; y++) {

                //Subtrair mesma posicao das matrizes e colocar na mesma posicao no resultado
                resultado[x][y] = matA[x][y] - matB[x][y];

            }
        }

        //Retorna o resultado
        return resultado;
    }
    


}
