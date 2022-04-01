import java.util.Arrays;
import java.util.Scanner;

public class OrdemCrescente {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int[] numero = new int [3];
        for(int i=0; i<3; i++){
            System.out.println("Digite aqui " + (i+1) + " número: ");
            numero[i] = ler.nextInt();
        }
        Arrays.sort(numero);

        System.out.println("Os números em ordem crescente são: " +numero[0]+", "+ numero[1]+" e "+numero[2]);

    }
}
