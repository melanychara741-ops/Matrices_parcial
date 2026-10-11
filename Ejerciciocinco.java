/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.Scanner;
public class Ejerciciocinco {
   static int  totalProductosInicializados=0;
   static Scanner scan= new Scanner(System.in);
   
   static void registrar(double [][] p){
   for(int i=0;i<p.length;i++){

   System.out.println("Ingresa la cantidad unitaria del producto "+(i+1));
   p[i][0]=scan.nextDouble();
   System.out.println("Ingresa el precio unitario del producto "+(i+1));
   p[i][1]=scan.nextDouble();   
   totalProductosInicializados++;  
   }
   
   }
   static double total(double[][]p){
   double total=0;
   
   for(int i=0;i<p.length;i++){
   total+=p[i][0]*p[i][1];
   }

   return total;
   }
   
    public static void main(String[] args) {
        double[][]productos=new double[3][2];
        registrar(productos);
        double total=total(productos);
        
        System.out.println("Productos registrados: "+totalProductosInicializados);
        System.out.println("Total del inventario: "+total);
    }
   
}
