import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        //Obter pela Scanner os valores digitados no terminal
        System.out.println("Digite o número da sua Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o valor do seu saldo: ");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem conta criada
        String mensagem = "Olá ".concat(nome) + ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +numero+ " e seu saldo " +saldo+ " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    }
}
