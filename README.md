# Pix Impresso

Sistema de saque rápido em caixas eletrônicos.

## Etapas de uma operação de saque

1 - Ir até um caixa eletrônico
2 - Inserir o cartão
3 - Inserir a senha
4 - Validar a senha
5 - Informar o valor do saque
6 - Validar se o caixa possui saldo
7 - Validar se a conta possui saldo
8 - Liberar o dinheiro para o cliente
9 - Registrar a transação
10 - Encerrar a operação

## Classes

### Conta
- idConta
- numero
- agencia
- digitoVerificador
- nome
- cpf
- tipoConta (1 - Conta Correte | 2 - Conta Salário | 3 - Conta Poupança)
- numeroCartao
- senha

### CaixaEletrocino
- idCaixaEletronico
- localizacao
- saldo

### Transacao
- idTransacao
- dataHora
- valor
- tipoTransacao (C - Crédito | D - Débito)
- idConta
- idCaixaEletronico