import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {


        // Definindo Scanner
        Scanner sc = new Scanner(System.in);

        //Agencia e Numero da conta pré-definidos!
        int numero = 1001;
        String agencia = "234-5";

        System.out.println("Digite Seu Primeiro Nome: ");
        String nomeCliente = sc.next();

        System.out.println("Digite Seu Ultimo Nome: ");
        String sobrenomeCliente = sc.next();

        System.out.println("Qual o valor do seu primeiro deposito? ");
        float saldo = sc.nextFloat();


        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque");
    }
}
