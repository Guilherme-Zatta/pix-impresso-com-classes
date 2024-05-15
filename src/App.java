import java.util.ArrayList;
import java.util.Scanner;

import classes.Conta;
import classes.ContaCorrente;
import classes.ContaSalario;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Conta> contas = new ArrayList<Conta>();
        contas.add(new ContaCorrente(1, 123,
                1234, 0,
                "Guilherme Zatta",
                "123.456.789-00",
                "1234567891234567", "123"));
        contas.add(new ContaSalario(2, 123,
                1234, 0,
                "Guilherme Zatta",
                "123.456.789-00",
                "1234567891234563", "123"));

        Scanner scanner = new Scanner(System.in);
        // ENTRADA
        // 1 - Ir até um caixa eletrônico
        // 2 - Inserir o cartão
        // 2.1 - Ler os dados do cartão
        System.out.println("Insira o numero do cartão: ");
        String numeroCartao = scanner.nextLine();

        Conta contaSaque = null;
        for (Conta conta : contas) {
            // se o número do cartão for igual ao número do cartão de uma conta
            if (conta.getNumeroCartao().equals(numeroCartao)) {
                contaSaque = conta;
                break;
            }
        }

        if (contaSaque == null) {
            scanner.close();
            throw new Error("Conta não encontrada");
        }

        // 3 - Inserir a senha
        System.out.println("Insira a senha: ");
        String senha = scanner.nextLine();

        scanner.close();

        // 4 - Validar a senha (processamento intermediario)
        // se a senha estiver incorreta, vai mostrar um erro e terminar o programa
        if (!contaSaque.getSenha().equals(senha)) {
            throw new Error("Senha inválida");
        }
        // 5 - Informar o valor do saque

        // PROCESSAMENTO
        // 6 - Validar se o caixa possui saldo
        // 7 - Validar se a conta possui saldo
        // 8 - Liberar o dinheiro para o cliente
        // 9 - Registrar a transação

        // SAÍDA
        // 10 - Encerrar a operação
        // 10.1 - Mostrar o comprovante da transação em tela
    }
}