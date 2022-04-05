package Laços;

import java.util.Scanner;

public class E02 {

    public static void main(String[] args) {

        int par = 0, impar = 0;
        int[] v = new int[10];
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite aqui o "+(i+1)+ "º número: ");
            v[i] = ler.nextInt();
            if (v[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Quantidade de pares: "+par+ "\nQuantidade de ímpares: "+impar);
    }
}
