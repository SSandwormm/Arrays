
package arraybidimensionalescodigo;

public class ArrayBidimensionalesCodigo {

    public static void main(String[] args) {
        String[][] valores = new String[20][20];

        // columna 1
        valores[0][0] = "1";
        valores[0][1] = "2";
        valores[0][2] = "3";

        //columna 2
        valores[1][0] = "4";
        valores[1][1] = "5";
        valores[1][2] = "6";

        //columna 3
        valores[2][0] = "7";
        valores[2][1] = "8";
        valores[2][2] = "9";

         for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(valores[i][j]);
                
            }
             System.out.println("");
         }
    }
    
}
