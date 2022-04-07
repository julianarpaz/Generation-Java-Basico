package Herança;

public class Teste {

    public static void main(String[] args) {

        Animal cavalo = new Cavalo ("Spirit", 15);
        Animal cachorro = new Cachorro ("Paçoca", 5);
        Animal preguiça = new Preguiça ("Manzanza", 25);

        cavalo.emitirSom(5);
        cachorro.emitirSom(6);
        preguiça.emitirSom(8);

        


    }
}
