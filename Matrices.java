/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

import java.util.Scanner;

public class Matrices {
    static int[][] matriz= new int [3][3];
    static Scanner scan= new Scanner(System.in);
    
    static void llenarMatriz(){
    for(int i=0;i<matriz.length;i++){
    for (int j=0;j<matriz[i].length;j++){
        System.out.println("Ingresa numero entero en la posicion ["+i+"]["+j+"]");
    matriz[i][j]=scan.nextInt();
    
    }
    }
    }
    
    static void mostrarMatriz(){
    for(int i=0;i<matriz.length;i++){
    for(int j=0;j<matriz[i].length;j++){
    System.out.print(matriz[i][j]+" ");
    }
    System.out.println();
    }
    
    }
    
    static int sumaDiagonal(int[][]u){
    
    int suma=0;
    
    for(int i=0;i<u.length;i++){
    suma+=u[i][i];
    }
    return suma;
    }
    
    static int sumaMatriz(int [][] m){
        int suma=0;
        for(int i=0;i<m.length;i++){
        for(int j=0;j<m[i].length;j++){
        suma+=matriz[i][j];
        }
        }
    return suma;
    }
    public static void main(String[] args) {
        
        llenarMatriz();
        mostrarMatriz();
        int total=sumaMatriz(matriz);
        int diagonal=sumaDiagonal(matriz);
        System.out.println("La suma total de la matriz es: "+total);
        System.out.println("La suma total de la diagonal principal de la matriz es: "+diagonal);
    
    }
    
}
