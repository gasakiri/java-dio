import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        int numeroConta = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;
        System.out.println("Olá, digite o seu nome!");
        nomeCliente = scanner.next();
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.next();
        System.out.println("Digite o número de sua conta!");
        numeroConta = scanner.nextInt();
        System.out.println("Digite o seu saldo!");
        saldo = scanner.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n",
                nomeCliente, agencia, numeroConta, saldo);
        scanner.close();
    }
}
