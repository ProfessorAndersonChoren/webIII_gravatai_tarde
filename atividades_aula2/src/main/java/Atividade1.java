import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Entrada
        System.out.println("Digite o valor do raio:");
        float raio = teclado.nextFloat();

        // Processamento
        double area = Math.PI * raio * raio;

        // Saída
        System.out.printf("A = %.4f",area);
    }
}
