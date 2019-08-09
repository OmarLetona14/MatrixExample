/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;
import java.util.Scanner;

public class GenerarMatriz {
    
    Scanner scan = new Scanner(System.in);
    int[][] matrix_pares, matrix_impares;
    int dimension = 0;
    
    public void mostrarMenu(){
        
        System.out.println("Introduzca la dimension de la matriz");
        try{
            dimension = scan.nextInt();
        }catch(Exception e){
            System.out.println("Introduzca un valor numerico");
            
        }
        if(dimension>=0){
            matrix_pares = new int[dimension][dimension];
            matrix_impares = new int[dimension][dimension];
            llenarMatriz(dimension);
        }else{
            System.out.println("Solo pueden introducirse valores mayores a cero");
            mostrarMenu();
        }
        System.out.println("---------- NUMEROS PARES ----------" );
        System.out.println("");
        imprimirMatriz(matrix_pares);
        System.out.println("---------- NUMEROS IMPARES ----------" );
        System.out.println("");
        imprimirMatriz(matrix_impares);
        
    }
    
    public void llenarMatriz(int tamanio_matriz){
        int numero_llenado = 0;
        for(int i = 0; i<tamanio_matriz;i++){           
            for(int j = 0;j<tamanio_matriz;j++){
                matrix_impares[i][j] = numero_llenado + 1;
                numero_llenado +=2;
                matrix_pares[j][i] = numero_llenado;
            }
        }
    }
    
    
    public void imprimirMatriz(int[][] matriz){
        for (int x=0; x < matriz.length; x++) {
        System.out.print("|");
        for (int y=0; y < matriz[x].length; y++) {
          System.out.print (matriz[x][y]);
          if (y!=matriz[x].length-1) System.out.print("\t");
        }
        System.out.println("|");
      }
    }
    
}
