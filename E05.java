import java.util.Scanner;

public class E05 {

    public static void main(String[] args) {

        double[] nota = new double[3];
        double media;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Insira aqui a " + (i + 1) + " nota: ");
            nota[i] = ler.nextInt();
        }

        media = (nota[0]*2 + nota[1]*3 + nota[2]*5)/10;

        System.out.println(String.format("A média do aluno é: %.2f", media));

    }
}
