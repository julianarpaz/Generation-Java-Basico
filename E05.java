package Laços;

import java.util.Scanner;

public class E05 {

    public static void main(String[] args) {

        int numero, contagem = 0;

        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("Insira um número diferente de 0: ");
            numero = ler.nextInt();
            contagem += numero;
        } while (numero != 0);

        System.out.println("Soma dos números digitados: " + contagem);

    }
}
