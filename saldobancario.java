import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "CLARK";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        double receber = 0;
        //Variavel de controle
        int escolha = 0;
        System.out.println("*******************************************");
        System.out.println("Nome do Cliente "+nome+"\nTipo da conta: "+tipoConta+"\nSaldo : "+saldo);
        System.out.println("*******************************************");


        while(escolha!=4){
            System.out.println("Operações \n 1-Consultar Saldo \n 2-Receber Valor \n 3-Transferir Valor \n 4- Sair \n Digite a opção desejada:");
            escolha = leitor.nextInt();
            if(escolha==1){
               System.out.println("Seu saldo é de "+saldo);
            }
            else if(escolha==2){
                System.out.println("Quanto deseja receber ?  ");
                receber= leitor.nextDouble();
                saldo +=receber;
                System.out.println("Seu saldo é de "+saldo);
            }
            else if(escolha==3){
                System.out.println("Digite o valor que deseja transferir : ");
                double transferir = leitor.nextDouble();
                if (transferir>saldo){
                    System.out.println("Saldo Insuficiente");
                }
                else{
                    saldo -=transferir;
                    System.out.println("Seu saldo atual é de "+saldo);
                }
            }
        }
    }
}
