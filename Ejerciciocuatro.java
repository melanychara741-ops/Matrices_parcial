/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;


import java.util.Scanner;

public class Ejerciciocuatro {
    static int[][]bus=new int[3][3];
    static Scanner scan=new Scanner(System.in);
    
    static void llenarMatriz(){
    
    for(int i=0;i<bus.length;i++ ){
    for(int j=0;j<bus[i].length;j++){
        System.out.print("posicion ["+i+"]["+j+"]");
    bus[i][j]=scan.nextInt();
    }
    }
    }
    static int cantidad(int[][] b,int n){
    int cantidad=0;
    for(int i=0;i<b.length;i++){
    for(int j=0;j<b[i].length;j++){
    if (b[i][j]==n){
    cantidad++;
    }
    }
    }
    return cantidad;
    }
    public static void main(String[] args) {
        
        llenarMatriz();
        
        System.out.print("Ingresa un numero que deseas buscar");
        int num=scan.nextInt();
        int veces=cantidad(bus,num);
        
        if(veces>0){
        System.out.println("El numero "+num+" aparece "+veces);
        
        }else{
                System.out.println("El numero ingresado no se encuentra en la matriz");
                }
        
        
    }
}
