package Laços;

import java.util.Scanner;

public class E06 {

    public static void main(String[] args) {

        int idade=0, menosDe21 = 0, maisDe50 = 0;

        Scanner ler = new Scanner(System.in);


        while(idade!=-99){
            System.out.println("Digite aqui outra idade: ");
            idade = ler.nextInt();
            if(idade<21&&idade!=-99){
                menosDe21++;
            }
            if(idade>50){
                maisDe50++;
            }
        }

        System.out.println("Total de pessoas com menos de 21: "+menosDe21+ "\nTotal de pessoas com mais de 50: "+maisDe50);

    }
}
