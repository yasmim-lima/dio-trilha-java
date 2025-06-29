import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);
        //Exibir as mensagens para o nosso usuário
        System.out.print("Digite o número da sua conta: ");
        var numConta = sc.nextInt();
        System.out.print("Digite o número da Agência: ");
        var agencia = sc.next();
        sc.nextLine();
        System.out.print("Digite o seu nome: ");
        var nomeCliente = sc.nextLine();
        System.out.print("Digite o valor do seu saldo: ");
        var saldo = sc.nextDouble();
        //Obter pelo scanner os valores digitados no terminal
        //Exibir a mensagem conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo " +
                "%.2f já está disponível para saque.\n", nomeCliente, agencia, numConta, saldo);
    }
}
