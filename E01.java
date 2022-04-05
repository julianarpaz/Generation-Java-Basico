package Laços;

public class E01 {

    public static void main(String[] args) {

        int quantidade, contador=0;

        for(int i = 1000; i<2000; i++ ){
            if(i%11 == 5){
                contador++;
            }
        }
        System.out.println("Quantidade é: "+contador);
    }
}
