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

public class ParcialPractica {
    
static boolean datosCargados=false;
static int lotesBajosMeta=0;

static void llenar(int[][] l, Scanner scan){

    for(int i=0;i<l.length;i++){
    for(int j=0;j<l[i].length;j++){
    
    System.out.println("Ingresala cantidad de kilos de cafe recolectados en el lote "+i+" en el mes "+j);
    l[i][j]=scan.nextInt();
    }
    }
    
    datosCargados=true;

}
static void mostrar(int[][]l){

System.out.println("MES");
System.out.println(" 1  2  3  4  5  6 ");
for(int i=0;i<l.length;i++){
for(int j=0;j<l[i].length;j++){
System.out.print(l[i][j]+"  ");
}
System.out.println();
}
}
    
    public static void main(String[] args) {
        
        int[][]lote=new int[4][6];
        Scanner scan= new Scanner(System.in);
        
        int opc;
        
        do{
            System.out.println("///MENU///");
            System.out.println("1. Registrar produccion");
            System.out.println("2. Mostrar produccion");
            System.out.println("3. Total por lote");
            System.out.println("4. Mejor mes");
            System.out.println("5. Lotes bajo meta");
            System.out.println("6. Promedio general y lotes destacados");
            System.out.println("7. Salir ");
            System.out.println("Ingresa una opcion");
            opc=scan.nextInt();
            
            switch(opc){
            
                case 1:
                  llenar(lote,scan); 
                  break;
                case 2:
                    if(datosCargados){
                    mostrar(lote);
                    }else{
                    System.out.println("Primero debes llenar la matriz con los datos correspondiente a la recolecta");
                    }
                    break;
            }
        
        }while(opc !=7);
        
    
    }
    
}
