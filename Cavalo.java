package Herança;

public class Cavalo extends Animal{

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(int valor) {
        for(int i=0; i<valor; i++){
            System.out.println("relinchando.");
        }
    }

    @Override
    public void correr(int velocidade) {
        if(velocidade<88){
            System.out.println("Cavalo correndo");
        } else{
            System.out.println("Muito rápido");
        }
    }
}
