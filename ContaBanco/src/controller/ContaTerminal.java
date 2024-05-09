import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o número da conta bancária:");
        int numero = teclado.nextInt();
        teclado.nextLine(); //Para corrigir o bug que passa direto por cima do próximo nextLine()

        System.out.println("Informe o número da agência bancária:");
        String agencia = teclado.nextLine();

        System.out.println("Informe o nome completo do cliente:");
        String nomeCliente = teclado.nextLine();

        System.out.println("Informe o saldo do cliente:");
        double saldo = teclado.nextDouble();

        //Me acostumando ao printf:
        System.out.println("--- Dados Bancários ---");
        System.out.printf("Agência: %s \n", agencia); // %s para String
        System.out.printf("Conta Corrente: %d \n", numero); // %d para int
        System.out.printf("Nome do Cliente: %s \n", nomeCliente);
        System.out.printf("Saldo disponível: R$ %.2f \n", saldo); // %.2f para double formatando em 2 casas decimais

        teclado.close();
    }
}
