import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        try (//TODO: Conhecer e importar a classe Scanner
        Scanner leitura = new Scanner(System.in)) {
            //TODO: Exibir as mensagens para o usuário e obter pela classe Scanner os valores digitados no terminal
            System.out.println("Digite o número da agência: ");
            numero = leitura.nextInt();
            leitura.nextLine();
            
            System.out.println("Digite a agência: ");
            agencia = leitura.nextLine();

            System.out.println("Digite o nome do cliente: ");
            nomeCliente = leitura.nextLine();

            System.out.println("Digite o saldo do cliente: ");
            saldo = leitura.nextDouble();
        }

        //TODO: Exibir a mensagem solicitada
        String mensagem = "Olá ";
        mensagem = mensagem.concat(nomeCliente);
        mensagem += ", obrigado por criar uma conta em nosso banco, sua agência é ";
        mensagem = mensagem.concat(agencia);
        mensagem += ", conta ";
        mensagem = mensagem.concat(String.valueOf(numero));
        mensagem += " e seu saldo ";
        mensagem = mensagem.concat(String.valueOf(saldo));
        mensagem += " já está disponível para saque.";
        System.out.println(mensagem);        
    }
}
