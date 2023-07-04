import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        float n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota:");
        float n2 = teclado.nextFloat();
        System.out.println("Digite a terceira nota");
        float n3 = teclado.nextFloat();
        System.out.println("Digite a quarta nota");
        float n4 = teclado.nextFloat();

        Aluno joao = new Aluno(n1,n2,n3,n4);

        System.out.printf("Media: %.1f\n",joao.getMedia());
        System.out.println(joao.verificarStatusDaAprovacao());

        if(joao.deveFazerExame()){
            System.out.println("Digite a nota do exame:");
            float notaExame = teclado.nextFloat();
            System.out.println(joao.verificarStatusExame(notaExame));
            System.out.printf("Media final: %.1f",joao.getMedia());
        }
    }
}
