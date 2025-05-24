import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
     // 1. Criar um objeto Scanner para ler a entrada do usuário
        // Usamos Locale.US para garantir que o separador decimal seja sempre o ponto (.),
        // Boa prática ao lidar com números decimais em inputs.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // 2. Declarar as variáveis para armazenar as informações da conta
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // 3. Solicitar e ler o número da Agência
        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.next(); // Lê a agência como uma String

        // 4. Solicitar e ler o número da Conta
        System.out.println("Por favor, digite o número da Conta !");
        numeroConta = scanner.nextInt(); // Lê o número da conta como um inteiro

        // 5. Solicitar e ler o nome do Cliente
        // Consumir a quebra de linha pendente após nextInt() para que nextLine() funcione corretamente
        scanner.nextLine();
        System.out.println("Por favor, digite o seu Nome Completo !");
        nomeCliente = scanner.nextLine(); // Lê o nome completo, que pode conter espaços

        // 6. Solicitar e ler o saldo
        System.out.println("Por favor, digite o valor do Saldo !");
        saldo = scanner.nextDouble(); // Lê o saldo como um double

        // 7. Exibir a mensagem final com os dados inseridos
        // Utilizando concatenação de Strings para montar a mensagem
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + String.format("%.2f", saldo) + " já está disponível para saque.");

        // 8. Fechar o objeto Scanner para liberar recursos
        scanner.close();
    }
}

