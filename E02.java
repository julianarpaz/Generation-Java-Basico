package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E02 {

    public static void main(String[] args) {

        int[] numero = new int[6];
        int[] par = new int[6];
        int[] impar = new int[6];
        int somaPar = 0, quantidadeImpar=0;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("Insira o " + (i + 1) + "º número:");
            numero[i] = ler.nextInt();
            if (numero[i] % 2 == 0) {
                par[i] = numero[i];
                somaPar += numero[i];
            } else{
                impar[i]= numero[i];
                quantidadeImpar++;
            }
        }
        System.out.println("Números pares digitados: " );
        Arrays.stream(par).forEach(System.out::println);
        System.out.println("Números impares digitados: ");
        Arrays.stream(par).forEach(System.out::println);
        System.out.println("A soma dos números pares: "+somaPar);
        System.out.println("A quantidade de impares: "+quantidadeImpar);
    }
}
