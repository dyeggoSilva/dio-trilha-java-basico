import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        System.out.println("Hello world!");


       int numeroConta;
       String agencia;
       String nomeCliente;
       double saldo;

       Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
       System.out.println("Qual o número da conta?: ");
       numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Qual o Agência?: ");
        agencia = sc.nextLine();

        System.out.println("Qual o nome do cliente?: ");
        nomeCliente = sc.nextLine();

        System.out.println("Qual o saldo da conta?: ");
        saldo = sc.nextDouble();

        sc.close();


        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}