package avaliacao01;

import java.time.LocalDateTime;
import java.util.List;

import simulado01.Musica;

public class ContaBancaria {
    int id;
    String titular;
    String numero;
    String agencia;
    double saldo;
    double limite;
    String tipo;
    List<Transacao> transacoes;

    public ContaBancaria(){
        System.out.println("chamou o contrutor vazio!");
    }

    public ContaBancaria(String titular){
        this.titular = titular;
    }

    public ContaBancaria(int id, String titular, String numero, String agencia, double saldo, double limite, List<Transacao> transacoes){
        this.id = id;
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
        this.transacoes = transacoes;
    }
}
