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
public class OperecoesGeometricas {
    
    public static void main(String[] args) throws Exception {

        // Inicializa matrizes de pixels da classe 4x4
        int[][] matriz = new int[4][4];

        matriz[0][0] = 2;
        matriz[0][1] = 0;
        matriz[0][2] = 4;
        matriz[0][3] = 5;

        matriz[1][0] = 6;
        matriz[1][1] = 4;
        matriz[1][2] = 1;
        matriz[1][3] = 2;

        matriz[2][0] = 50;
        matriz[2][1] = 0;
        matriz[2][2] = 3;
        matriz[2][3] = 12;

        matriz[3][0] = 20;
        matriz[3][1] = 40;
        matriz[3][2] = 40;
        matriz[3][3] = 20;

        

        //Criando classe para usar os métodos 
        OperecoesGeometricas matrizes = new OperecoesGeometricas();
              
        //Realiza Espelhamento
        int[][] espelhaV = matrizes.espelharMatrizVertical(matriz);
        //Realiza Espelhamento
        int[][] espelhaH = matrizes.espelharMatrizHorizontal(matriz);
        
 System.out.println("---Matrizes Resultantes - ESPELHAMENTO VERTICAL E HORIZONTAL ---");
  System.out.println("");
       
        //mostrando resultado
        matrizes.mostrarMatriz(espelhaV);
        matrizes.mostrarMatriz(espelhaH);
        
        //Show matriz
        matrizes.mostrarMatriz(matriz);
      

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

       
   private int[][] espelharMatrizVertical(int[][] matriz)
{
    int lar = matriz.length;//largura
    int alt = matriz[0].length;//altura
    int resultado[][] = new int[lar][alt];
     
    for (int l = 0; l < lar; l++)
    {
        for (int a = 0; a < alt; a++)
        {
            resultado[l][a] = matriz[(lar - 1) - l][a]; 
        }
    }
    return resultado;
}
   
   
  private int[][] espelharMatrizHorizontal(int[][] matriz)
{
    int lar = matriz.length;//largura
    int alt = matriz[0].length;//altura
    int resultado[][] = new int[alt][lar];
     
    for (int l = 0; l < alt; l++)
    {
        for (int a = 0; a < lar; a++)
        {
            resultado[l][lar -a-1] = matriz[l][a]; 
        }
    }
    return resultado;
}
   


}
