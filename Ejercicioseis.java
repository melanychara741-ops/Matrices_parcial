/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.Scanner;

public class Ejercicioseis {
    static Scanner scan=new Scanner(System.in);
    static int[][]matriz=new int[3][3];
    static boolean inicializar=false;
    
    static void llenarMatriz(){
    
        for(int i=0;i<matriz.length;i++){
        for(int j=0;j<matriz[i].length;j++){
        System.out.println("Posicion ["+i+"]["+j+"]");
        matriz[i][j]=scan.nextInt();
        }
        }
        inicializar=true;
    
    }
    static void mostrarMatriz(){
    
    for(int i=0;i<matriz.length;i++){
    for(int j=0;j<matriz[i].length;j++){
    System.out.print(matriz[i][j]+" ");
    }
    System.out.println();
    }
    }
    
    static int sumaDiagonal(int[][]m){
    int suma=0;
        for(int i=0;i<m.length;i++){
            suma+=m[i][i];
    
    }
        return suma;
    }
    
    static int contarPares(int[][]m){
    int contador=0;
        for(int i=0;i<m.length;i++){
    for(int j=0;j<m[i].length;j++){
        if(m[i][j]%2==0){
        contador++;
        }
    }
    }
        return contador;
    }
    public static void main(String[] args) {
        
        int opc;
        
        do{
        System.out.println("///M E N U///");
        System.out.println("1. LLENAR MATRIZ");
        System.out.println("2. MOSTRAR MATRIZ");
        System.out.println("3. SUMA DIAGONAL PRINCIPAL");
        System.out.println("4. CONTAR PARES");
        System.out.println("5. SALIR DE AQUI");
        System.out.println("Ingresa una opcion");
        opc=scan.nextInt();
        
        switch(opc){
        
            case 1:
                llenarMatriz();
                break;
            case 2:
                if(inicializar){
                mostrarMatriz();
                }else{
                System.out.println("Primero llena la matriz con datos");
                }
                break;
            case 3:
                int suma=sumaDiagonal(matriz);
                System.out.println("La suma de la diagonal principal es: "+suma);
                break;
            case 4:
                int par=contarPares(matriz);
                System.out.println("La cantidad de pares encontrados en la matriz fue: "+par);
                break;
            case 5:
                System.out.println("Hasta luego...");
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
        }while(opc !=5);
        scan.close();
        
    }
}
