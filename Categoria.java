import java.util.Scanner;

public class Categoria {

    public static void main(String[] args) {

        int idade;
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira a idade do atleta: ");
        idade = ler.nextInt();

        if(idade>=10 && idade<=14){
            System.out.println("Atleta da categoria infantil.");
        } else if (idade>=15 && idade<=17){
            System.out.println("Atleta da categoria juvenil.");
        } else if (idade>=18 && idade<=25) {
            System.out.println("Atleta da categoria adulta.");
        } else{
            System.out.println("Idade fora da faixa da competição");
        }

    }

}
