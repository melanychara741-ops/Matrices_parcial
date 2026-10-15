/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author HOME
 */
import java.util.Scanner;

public class Ejerciciosiete {
    static int sumaColumna(int[][] m,int col){
    int suma=0;
    
    for(int i=0;i<m.length;i++){
    suma+=m[i][col];
    }
        return suma;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);        
        int [][] matriz= new int[3][4];
        

        
        for(int i=0;i<matriz.length;i++){
        for(int j=0;j<matriz[i].length;j++){
        System.out.println("Ingresa el dato en la posicion ["+i+"]["+j+"]");
        matriz[i][j]=scan.nextInt();
        }
        }
        for(int i=0;i<matriz.length;i++){
        for(int j=0;j<matriz[i].length;j++){
        System.out.print(matriz[i][j]+" ");
        }
        System.out.println();
        }        
        System.out.println("Ingresa la columna que quieres sumar (0-3)");
        int columna=scan.nextInt();
        
        System.out.println("La suma de la columna "+columna+" es: "+sumaColumna(matriz,columna));
        
        
    }
    
}
