package Herança;

public class Animal {

    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom(int valor){
        System.out.println("Emitindo um som.");
    }
    public void correr(int velocidade){
        System.out.println("Correndo.");
    }

}
