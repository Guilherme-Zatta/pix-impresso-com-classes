package classes;

import java.time.LocalDateTime;

public class Transacao {
    private int idTransacao;
    private int idConta;
    private int idCaixaEletronico;
    private LocalDateTime dataHora;
    private double valor;
    // (C - Crédito | D - Débito)
    private char tipoTransacao;

    public Transacao(int idTransacao, int idConta, int idCaixaEletronico, double valor, char tipoTransacao) {
        this.idTransacao = idTransacao;
        this.idConta = idConta;
        this.idCaixaEletronico = idCaixaEletronico;
        this.valor = valor;
        this.tipoTransacao = tipoTransacao;
        this.dataHora = LocalDateTime.now();
    }

    public int getIdTransacao() {
        return idTransacao;
    }

    public int getIdConta() {
        return idConta;
    }

    public int getIdCaixaEletronico() {
        return idCaixaEletronico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public double getValor() {
        return valor;
    }

    public char getTipoTransacao() {
        return tipoTransacao;
    }
    
}
