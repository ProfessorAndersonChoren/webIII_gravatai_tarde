import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        float porcentagem = 0.15f; // Equivale à 15%
        Scanner teclado = new Scanner(System.in);

        // Entrada
        System.out.println("Digite o salário do vendedor:");
        float salario = teclado.nextFloat();
        System.out.println("Digite o total de vendas realizadas pelo vendedor");
        float totalDeVendas = teclado.nextFloat();

        // Processamento
        salario = totalDeVendas * porcentagem + salario;

        // Saída
        System.out.printf("O vendedor receberá R$ %.2f esse mês",salario);
    }
}
