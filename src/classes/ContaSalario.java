package classes;

public class ContaSalario extends Conta {

  public ContaSalario(int idConta, int numero,
      int agencia, int digitoVerificador,
      String nome, String cpf,
      String numeroCartao, String senha,
      double saldo) {
    super(idConta, numero, agencia,
        digitoVerificador, nome,
        cpf, numeroCartao, senha, saldo);
  }

  @Override
  public void setTipoConta() {
    super.setTipoConta(2);
  }

}