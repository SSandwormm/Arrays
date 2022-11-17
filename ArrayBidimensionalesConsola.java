
package arraybidimensionalesconsola;

import java.util.Scanner;

public class ArrayBidimensionalesConsola {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);         
        int matriz[][], filas = 0, colu = 0;
        
        System.out.println("digite el numero de filas");
        filas = entrada.nextInt();
        System.out.println("digite el numero de columnas");
        colu = entrada.nextInt();
        
        

        matriz = new int[filas][colu];

        System.out.println("digite la matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j <colu; j++) {
                System.out.print("matriz ["+i+"]["+j+"]:");
                matriz [i][j] = entrada.nextInt();
            }
        }
        
        for (int i = 0; i <filas; i++) {
            for (int j = 0; j <colu; j++) {
                System.out.print(matriz[i] [j]);
            }
            System.out.println("");
        }
    }
    
}
