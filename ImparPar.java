import java.util.Scanner;

public class ImparPar {

    public static void main(String[] args) {

        int numero;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite aqui o número: ");
        numero = ler.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Este número é par e sua raíz quadrada é: " + Math.sqrt(numero));
        } else {
            System.out.println("Este número é ímpar e seu quadrado é: " +Math.pow(numero,2));
        }
    }
}
