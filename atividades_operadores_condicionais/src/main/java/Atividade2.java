import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do lado A:");
        byte ladoA = teclado.nextByte();
        System.out.println("Digite o valor do lado B:");
        byte ladoB = teclado.nextByte();
        System.out.println("Digite o valor do lado C:");
        byte ladoC = teclado.nextByte();

        double quadradoDeA = Math.pow(ladoA, 2);
        double quadradoDeB = Math.pow(ladoB, 2);
        double quadradoDeC = Math.pow(ladoC, 2);
        if(ladoA >= ladoB + ladoC)
            System.out.println("NÃO FORMA TRIÂNGULO");
        else{
            // 1° Subtipo (Obtusângulo ou Acutângulo)
            if(quadradoDeA > quadradoDeB + quadradoDeC)
                System.out.println("TRIÂNGULO OBTUSÂNGULO");
            else if(quadradoDeA < quadradoDeB + quadradoDeC)
                System.out.println("TRIÂNGULO ACUTÂNGULO");

            // 2° Tipo (Retângulo, Isóceles ou Escaleno)
            if(quadradoDeA == quadradoDeB + quadradoDeC)
                System.out.println("TRIÂNGULO RETÂNGULO");
            else if(quadradoDeA == quadradoDeB && quadradoDeA == quadradoDeC)
                System.out.println("TRIÂNGULO EQUILÁTERO");
            else
                System.out.println("TRIÂNGULO ISÓCELES");
        }
    }
}
