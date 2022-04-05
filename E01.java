package Arrays;

import java.util.Scanner;

public class E01 {

    public static void main(String[] args) {

        int[] A = new int[6];
        int soma, resposta, indice, novo;

        Scanner ler = new Scanner (System.in);

        A[0] = 1;
        A[1] = 0;
        A[2] = 5;
        A[3] = -2;
        A[4] = -5;
        A[5] = 7;

        soma = A[0] + A[1] + A[5];

        System.out.println("Deseja modificar algum valor?\nAperte 1 para Sim e 2 para Não");
        resposta = ler.nextInt();
        System.out.println("Qual posição do vetor modificar?");
        indice = ler.nextInt();
        System.out.println("Qual o novo valor?");
        novo = ler.nextInt();


        if(resposta == 1){
            A[indice-1] = novo;
        }
        System.out.println("Valores do vetor A: ");
        for(int i=0; i<6; i++){
            System.out.println(A[i]);
        }






    }
}
