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

public class Ejercicioocho {
    static int contarPositivo(int [][]m){
    int positivo=0;
    
    for(int i=0;i<m.length;i++){
    for(int j=0;j<m[i].length;j++){
    if(m[i][j]>0){
    positivo++;
    }
    }
    }
    return positivo;
    }
    static int contarNegativo(int [][]m){
    int negativo=0;
    
    for(int i=0;i<m.length;i++){
    for(int j=0;j<m[i].length;j++){
    if(m[i][j]<0){
    negativo++;
    }
    }
    }
    return negativo;
    }    
    static int contarceros(int [][]m){
    int cero=0;
    
    for(int i=0;i<m.length;i++){
    for(int j=0;j<m[i].length;j++){
    if(m[i][j]==0){
    cero++;
    }
    }
    }
    return cero;
    }  
    static void escalar(int [][]m,int escalar){
    int[][]nuevo=new int[m.length][m[0].length];
    
            for(int i=0;i<m.length;i++){
    for(int j=0;j<m[i].length;j++){
    nuevo[i][j]=m[i][j]*escalar;
    }
    }
            for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
            System.out.print(nuevo[i][j]+" ");
            }
            System.out.println();
            }
    }
    public static void main(String[] args) {
        int [][] matriz=new int[4][4];
        Scanner scan=new Scanner(System.in);
        
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
        
        System.out.println("La cantidad de numeros positivos que hay en la matriz es: "+contarPositivo(matriz));
        System.out.println("La cantidad de numeros negativos que hay en la matriz es: "+contarNegativo(matriz));
        System.out.println("La cantidad de numeros ceros que hay en la matriz es: "+contarceros(matriz)); 
        System.out.println();
        System.out.println("Ingrese un numero escalar para multiplicar la matriz");
        int escalar=scan.nextInt();
        
        escalar(matriz,escalar);
        }
    
}
