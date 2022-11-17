package arrayconsola;

import java.util.Scanner;

public class ArrayConsola {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int lim;

        System.out.println("cuantos numeros va ingresar al array");
        lim = entrada.nextInt();

        for (int i = 0; i <= lim; i++) {
            System.out.println("ingresar un numeros al arreglo =" + (i + 1));
            arreglo[i] = entrada.nextInt();
        }

        for (int i = 0; i <= lim; i++) {
            System.out.print(arreglo[i] + ",");
        }
    }

}
