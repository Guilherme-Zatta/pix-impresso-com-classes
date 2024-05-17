
import java.util.ArrayList;
import java.util.Scanner;

import classes.CaixaEletronico;
import classes.Conta;
import classes.ContaCorrente;
import classes.ContaPoupanca;
import classes.ContaSalario;
import classes.Transacao;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Conta> contas = new ArrayList<Conta>();
        contas.add(new ContaCorrente(1, 123,
                1234, 0,
                "Guilherme Zatta",
                "123.456.789-00",
                "1234567891234567", "123", 5000));
      
        contas.add(new ContaSalario(2, 123,
                1234, 0,
                "Guilherme Zatta",
                "123.456.789-00",
                "1234567891234563", "123", 1000));

        contas.add(new ContaPoupanca(3, 123,
                1234, 0,
                "Guilherme Zatta",
                "123.456.789-00",
                "1234567891234562", "123",500));

        // TODO - Criar uma lista de caixas eletronicos
        // TODO - Criar objetos do tipo caixa eletronico
        ArrayList<CaixaEletronico> caixas = new ArrayList<CaixaEletronico>();
        caixas.add(new CaixaEletronico(1, 
        "PB - Centro", 5000));
        caixas.add(new CaixaEletronico(2, 
        "PB - Zona Norte", 1000));
        caixas.add(new CaixaEletronico(3, 
        "FB - Centro", 2000));
        caixas.add(new CaixaEletronico(4, 
        "VT - Centro", 800));

        //Lista de transacoes
        ArrayList<transacoes

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
        
        // 4 - Validar a senha (processamento intermediario)
        // se a senha estiver incorreta, vai mostrar um erro e terminar o programa
        if (!contaSaque.getSenha().equals(senha)) {
            throw new Error("Senha inválida");
        }

        // 5 - Informar o valor do saque
        System.out.println("Insira o valor do saque: ");
        Double saque = scanner.nextDouble();
        
        // TODO - 5.1 - Informar o id do Caixa Eletronico
        System.out.println("Insira o ID do Caixa Eletronico: ");
        int idCaixa = scanner.nextInt();
        scanner.close();

        // TODO - 5.2 - Buscar o caixa eletronico na lista
         CaixaEletronico caixaId = null;
        for (CaixaEletronico CaixaEletronico : caixas) {
            // se o número do cartão for igual ao número do cartão de uma conta
            if (CaixaEletronico.getIdCaixaEletronico() == idCaixa) {
                caixaId = CaixaEletronico;
                break;
            }
        }

        if (caixaId == null) {
            throw new Error("Caixa não encontrado");
        }

        // PROCESSAMENTO
        // 6 - Validar se o caixa possui saldo
        if (caixaId.getSaldo() < saque) {
            throw new Error("Caixa Eletrônico sem saldo!");
        }

        // 7 - Validar se a conta possui saldo
        if (contaSaque.getSaldo() < saque) {
            throw new Error("Conta Bancária sem saldo!");
        }

        // 8 - Liberar o dinheiro para o cliente
        System.out.println();

        // 9 - Registrar a transação
        transacoes.add(new Transacao(1,
        contaSaque.getIdConta(),
        saque.getIdCaixaEletronico(),
        valorSaque,
        'D'));

        // SAÍDA
        // 10 - Encerrar a operação
        // 10.1 - Mostrar o comprovante da transação em tela
    }

}