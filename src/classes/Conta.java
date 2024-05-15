package classes;

// classe abstrata
public abstract class Conta {
  protected int idConta;
  protected int numero;
  protected int agencia;
  protected int digitoVerificador;
  protected String nome;
  protected String cpf;
  // (1-Conta Corrente | 2-Conta Salário | 3-Conta Poupança)
  protected int tipoConta;
  protected String numeroCartao;
  protected String senha;

  public Conta(int idConta, int numero, int agencia,
      int digitoVerificador, String nome,
      String cpf, String numeroCartao, String senha) {
    this.idConta = idConta;
    this.numero = numero;
    this.agencia = agencia;
    this.digitoVerificador = digitoVerificador;
    this.nome = nome;
    this.cpf = cpf;
    this.numeroCartao = numeroCartao;
    this.senha = senha;
  }

  public void setTipoConta() {
  }

  public int getTipoConta() {
    return tipoConta;
  }

  public int getIdConta() {
    return idConta;
  }

  public void setIdConta(int idConta) {
    this.idConta = idConta;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getAgencia() {
    return agencia;
  }

  public void setAgencia(int agencia) {
    this.agencia = agencia;
  }

  public int getDigitoVerificador() {
    return digitoVerificador;
  }

  public void setDigitoVerificador(int digitoVerificador) {
    this.digitoVerificador = digitoVerificador;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setTipoConta(int tipoConta) {
    this.tipoConta = tipoConta;
  }

  public String getNumeroCartao() {
    return numeroCartao;
  }

  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

}