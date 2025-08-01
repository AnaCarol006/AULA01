package avaliacao01;

import java.time.LocalDateTime;

public class Transacao {
    int id;
    String tipo;
    double valor;
    LocalDateTime dataHora;
    String status;


    public Transacao() {
        System.out.println("chamou o contrutor vazio!");
    }

    public Transacao(String tipo){
        this.tipo = tipo;
    }

    public Transacao(int id, String tipo, double valor, LocalDateTime dataHora, String status){
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.dataHora = dataHora;
        this.status = status;

    }

}
