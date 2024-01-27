import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o nome do titular da conta:");
            String nomeCliente = scanner.nextLine();
            System.out.println("Por favor, digite o número da conta:");
            int numero = scanner.nextInt();
            System.out.println("Por favor, digite a agência do titular da conta:");
            String agencia = scanner.next();
            System.out.println("Por favor, digite o saldo da conta:");
            double saldo = scanner.nextDouble();

            System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");
        }

    }
}
