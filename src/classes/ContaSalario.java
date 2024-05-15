package classes;

public class ContaSalario extends Conta {

  public ContaSalario(int idConta, int numero,
      int agencia, int digitoVerificador,
      String nome, String cpf,
      String numeroCartao, String senha) {
    super(idConta, numero, agencia,
        digitoVerificador, nome,
        cpf, numeroCartao, senha);
  }

  @Override
  public void setTipoConta() {
    this.tipoConta = 2;
  }

}