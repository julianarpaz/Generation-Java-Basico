import java.util.Scanner;

public class MaiorInteiro {

    public static void main(String[] args) {

        int[] numero = new int[3];
        int maior = 0;

        Scanner ler = new Scanner(System.in);

        for (int i=0; i < 3; i++) {
            System.out.println("Digite aqui " + (i+1) + " número: ");
            numero[i] = ler.nextInt();
            if (maior < numero[i]) {
                maior = numero[i];
            }
        }

        System.out.println("O maior número é: " + maior);

    }
}
