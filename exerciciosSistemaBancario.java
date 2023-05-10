
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("*********************************************");
        System.out.println("Seja Bem Vindo ao Sistema Bancário ");
        System.out.println("*********************************************");
        System.out.println("Digite o valor que deseja pegar emprestado : ");
        double emprestimo = leitor.nextDouble();
        System.out.println("Em quantas parcelas deseja pagar ? ");
        int parcelas = leitor.nextInt();
        double totalDivida = emprestimo/parcelas;
        int totalPago =0;
        for (int i =1 ; i <= parcelas;i++){
            double juros = totalDivida * 0.02;
            totalDivida+= juros;
            totalPago +=totalDivida;
            System.out.println(i+"Parcela - "+totalDivida);

        }
        System.out.println("O emprestimo de "+ emprestimo+" ficou no total de R$"+totalPago);
    }
}
