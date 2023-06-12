import java.math.BigDecimal;
import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Entrada
        System.out.println("Digite o valor do capital investido:");
        float capital = teclado.nextFloat();
        System.out.println("Digite o valor da taxa de juros:");
        float taxa = teclado.nextByte();
        taxa /= 100;
        System.out.println("Digite o período do investimento:");
        byte periodo = teclado.nextByte();

        // Processamento
        double montante = capital * Math.pow(1+taxa,periodo);

        // Saída
        System.out.printf("Ao final da aplicação o cliente receberá o valor de R$ %.2f",montante);
    }
}
