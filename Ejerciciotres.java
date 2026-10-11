/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.Scanner;

public class Ejerciciotres {
    static int [][] mm=new int[3][4];
    static Scanner scan= new Scanner(System.in);
    
    static void mostrarMatriz(){
    
        for(int i=0;i<mm.length;i++){
        for(int j=0;j<mm[i].length;j++)
            System.out.print(mm[i][j]+" ");
        }
        System.out.println();
    
    }
    
    static int mayor(int [][]m){
    int mayor=m[0][0];
    
    for(int i=0;i<m.length;i++){
    for(int j=0;j<m[i].length;j++){
    
    if(m[i][j]>mayor){
    mayor=m[i][j];
    }
    }
    }
    return mayor;
    }
    
    static int menor(int [][]m){
    int menor=m[0][0];
    
    for(int i=0;i<m.length;i++){
    
    for(int j=0;j<m[i].length;j++){
    if(m[i][j]<menor){
    menor=m[i][j];
    }
    }
    }
    return menor;
    }
       
    public static void main(String[] args) {
        
        for(int i=0;i<mm.length;i++){
        for(int j=0;j<mm[i].length;j++){
        System.out.println("Ingresa un numero entero en la posicion ["+i+"]["+j+"]");
        mm[i][j]=scan.nextInt();
        }
        }
        mostrarMatriz();
        int datoMayor=mayor(mm);
        int datoMenor=menor(mm);
        System.out.println("El numero mayor es: "+datoMayor);
        System.out.println("El numero menor es: "+datoMenor);
        
    }
    
}
