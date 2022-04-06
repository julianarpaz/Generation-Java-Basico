public class Teste {

    public static void main(String[] args) {

        ContaBancaria Juliana = new ContaBancaria("Juliana Paz",1,2468);
        ContaBancaria Luis = new ContaBancaria("Luis Guerreiro",1,1359);

        System.out.println("O saldo da conta de Juliana é: "+Juliana.getSaldo());
        System.out.println("O saldo da conta de Luis é: "+Luis.getSaldo());

        Juliana.deposito(250.00);
        System.out.println("O saldo da conta de Juliana após o deposito é: "+Juliana.getSaldo());

        //Juliana.saque(300.00);

        Juliana.saque(150.00);

        System.out.println("O valor após o saque é de: "+Juliana.getSaldo());

        Luis.transferencia(50.00, Juliana);

        System.out.println("O saldo da conta de Luis é de: "+Luis.getSaldo());

        Juliana.transferencia(50.00, Luis);

        System.out.println("O saldo da conta de Luis após a transferência é de: "+Luis.getSaldo());



    }
}
