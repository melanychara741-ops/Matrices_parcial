/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;


import java.util.Scanner;

public class Ejerciciodos {
    static double [][] notas=new double[4][3];
    static Scanner scan=new Scanner(System.in);
    
    static void llenarMatriz(){
    
    for(int i=0;i<notas.length;i++){
    for(int j=0;j<notas[i].length;j++){
        System.out.println("Ingresa la nota del estudiante "+(i+1)+" en la calificacion "+(j+1));
    notas[i][j]=scan.nextDouble();
    }
    }
    }
    static void mostrarMatriz(){
    System.out.println(" 1    2    3  ");
    
    for(int i=0;i<notas.length;i++){
        System.out.print("Estudiante 1: ");
    for(int j=0;j<notas[i].length;j++){
    System.out.print(notas[i][j]+"  ");
    }
    System.out.println();
    }
    }
    static double prom(double [][] n,int fila){
    double suma=0;
    
    for(int j=0;j<3;j++){
    suma+=n[fila][j];
    }
    return suma/3;
    }
            
    public static void main(String[] args) {
        
        llenarMatriz();
        mostrarMatriz();
        
        for(int i=0;i<4;i++){
        double promedio= prom(notas,i);
        if(promedio>=3.0){
        System.out.println("Estudiante"+(i+1)+" :aprobado con un promedio de: "+promedio);
        }else{
        System.out.println("Estudiante"+(i+1)+" :desaprobado con un promedio de: "+promedio);
        }
        }
        
    }
}
