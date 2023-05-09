import java.util.Scanner;
public class exercicio {
    public static void main(String[]args) {
        Scanner leitor = new Scanner(System.in);
        String nome="a";
        while(!nome.equals("fim")){
            System.out.println("Digite o seu nome: ");
            nome = leitor.next();
            if (nome.equals("fim")){
                System.out.println("Até a próxima!");
                break;
            }
            System.out.println("Digite o seu salário : ");
            double salario = leitor.nextDouble();

            if (salario > 150) {
                double aumento = salario * 0.25;
                double novoSalario = salario +aumento;
                System.out.println("Sr(a) " + nome + " seu aumento foi de "+aumento+" e  seu novo salário é " + novoSalario);
            } else if (salario > 150 && salario <= 300) {
                double aumento = salario * 0.20;
                double novoSalario = salario + aumento;
                System.out.println("Sr(a) " + nome + " seu aumento foi de "+aumento+" e seu novo salário é " + novoSalario);
            } else if (salario > 300 && salario <= 600) {
                double aumento = salario * 0.15;
                double novoSalario = salario + aumento;
                System.out.println("Sr(a) " + nome + " seu aumento foi de " +aumento+ " e seu novo salário é " + novoSalario);
            } else if (salario < 600) {
                double aumento = salario * 0.10;
                double novoSalario = salario + aumento;
                System.out.println("Sr(a) " + nome + " seu aumento foi de "+aumento+" e seu novo salário é R$ " + novoSalario);
            }

        }

    }
}
