package Herança;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(int valor) {
        for (int i = 0; i < valor; i++) {
            System.out.println("Latindo.");
        }
    }

    @Override
    public void correr(int velocidade) {
        if (velocidade < 72) {
            System.out.println("Correndo.");
        } else {
            System.out.println("Muito rápido.");
        }
    }
}
