package Arrays;

import java.util.Scanner;

public class E03 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        int contador =0;
        Scanner ler = new Scanner(System.in);

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println("Digite o valor da coordenada ["+i+ ","+j+"]");
                matriz[i][j] = ler.nextInt();
                if(matriz[i][j] > 10){
                    contador++;
                }
            }
        }
    }
}
