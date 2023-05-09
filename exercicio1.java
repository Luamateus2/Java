import java.util.Scanner;
public class exercicio {
    public static void main(String[]args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor a : ");
        int valorA = leitor.nextInt();
        System.out.println("Digite o valor b : ");
        int valorB = leitor.nextInt();
        if (valorB < valorA) {
            while (valorB < valorA) {
                valorB++;
                if (valorB % 2 != 0) {
                    System.out.println(valorB);
                }
            }
        }
        else if (valorA < valorB) {
            while (valorA < valorB) {
                valorA++;
                if (valorA % 2 != 0) {
                    System.out.println(valorA);
                }
            }
        }
    }
}
