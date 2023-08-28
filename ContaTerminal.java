import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        BigDecimal saldo;

        System.out.print("Por favor, digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt();

        System.out.print("Por favor, digite o saldo: ");
        saldo = scanner.nextBigDecimal();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.\n", nomeCliente, agencia, numero, saldo);

    }
}
