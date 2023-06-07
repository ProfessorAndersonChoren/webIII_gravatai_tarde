import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Entrada
        System.out.println("Digite a chapa do funcionário:");
        short chapa = teclado.nextShort();
        System.out.println("Digite o número de horas trabalhadas pelo funcionário:");
        short numHoras = teclado.nextShort();
        System.out.println("Digite o valor da hora do funcionário");
        float valorHora  = teclado.nextFloat();

        // Processamento
        float salario = valorHora * numHoras;

        // Saída
        System.out.printf("CHAPA = %d%n",chapa);
        System.out.printf("SALÁRIO = R$ %.2f",salario);
    }
}
