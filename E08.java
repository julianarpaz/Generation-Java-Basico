import java.util.Scanner;

public class E08 {

    public static void main(String[] args) {

        double custo_de_fabrica, preco_final;
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o custo de fábrica do automóvel: ");
        custo_de_fabrica = ler.nextInt();

        preco_final = custo_de_fabrica + custo_de_fabrica*0.28 + custo_de_fabrica*0.45;

        System.out.println("Valor do automóvel para o consumidor final: " +preco_final);

        }
    }

