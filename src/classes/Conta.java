package classes;

public class Conta {
    private int idConta;
    private int numero;
    private int agencia;
    private int digitoVerificador;
    private String nome;
    private String cpf;
    //  (1 - Conta Correte | 2 - Conta Salário | 3 - Conta Poupança)
    private int tipoConta;
    private String numeroCartao;
    private String senha;

    public Conta(int idConta, int numero, 
            int agencia, int digitoVerificador, 
            String nome, String cpf, int tipoConta,
            String numeroCartao, String senha) {
        this.idConta = idConta;
        this.numero = numero;
        this.agencia = agencia;
        this.digitoVerificador = digitoVerificador;
        this.nome = nome;
        this.cpf = cpf;
        this.tipoConta = tipoConta;
        this.numeroCartao = numeroCartao;
        this.senha = senha;
    }

    public int getIdConta() {
        return idConta;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getDigitoVerificador() {
        return digitoVerificador;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getSenha() {
        return senha;
    }
    
    
}
