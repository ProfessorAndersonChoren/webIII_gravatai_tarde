import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Entrada
        System.out.println("Digite a velocidade em m/s");
        float velocidade = teclado.nextByte();
        System.out.println("Digite a tempo em dias");
        float tempo = teclado.nextFloat();

        // Processamento
        tempo *= 24;
        velocidade *= 3.6;
        float distancia = velocidade * tempo;

        // Saída
        System.out.printf("Distância = %.0f",distancia);
    }
}
