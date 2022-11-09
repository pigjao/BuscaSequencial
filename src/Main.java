import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};


        int cont = 0;


        int busca = leitor.nextInt();
        for(int i = 0; i < elementos.length; i++){
            if(elementos[i] == busca){
                System.out.println("Achei " +busca+ " na posicao "+i);
            break;
            } else if(elementos.length == (i+1)){
                System.out.println("Numero "+busca+" nao encontrado!");
            }


        }
    }
}