package avaliacao01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CadastroApp {
    public static void main(String[] args) {
        Transacao transacao1 = new Transacao(32, "saque", 340, LocalDateTime.now(), "finalizada\n");
        Transacao transacao2 = new Transacao();
        Transacao transacao3 = new Transacao();
        ContaBancaria contaBancaria = new ContaBancaria();


        transacao2.id = 55;
        transacao2.tipo = "saque";
        transacao2.valor = 520;
        transacao2.dataHora = LocalDateTime.now();
        transacao2.status = "finalizada\n";

        transacao3.id = 68;
        transacao3.tipo = "deposito";
        transacao3.valor = 200;
        transacao3.dataHora = LocalDateTime.now();
        transacao3.status = "cancelada\n";


        List<Transacao> listaTransacoes = new ArrayList<>();
        listaTransacoes.add(transacao1);
        listaTransacoes.add(transacao2);
        listaTransacoes.add(transacao3);

        
        contaBancaria.id = 207;
        contaBancaria.titular = "Mariana Santos";
        contaBancaria.numero = "1003001";
        contaBancaria.agencia = "Inter";
        contaBancaria.saldo = 6000;
        contaBancaria.limite = 12000;
        contaBancaria.tipo = "Corrente";
        contaBancaria.transacoes = List.of(transacao1, transacao2, transacao3);

        System.out.println("\n*** CONTA BANCARIA ***");
        System.out.println("ID: " + contaBancaria.id);
        System.out.println("Titular: " + contaBancaria.titular);
        System.out.println("Numero: " + contaBancaria.numero);
        System.out.println("Agencia: " + contaBancaria.agencia);
        System.out.println("Saldo: " + contaBancaria.saldo);
        System.out.println("Limite: " + contaBancaria.limite);
        System.out.println("Tipo: " + contaBancaria.tipo);


        System.out.println("\nTransacoes: \n");

        for (Transacao transacao : contaBancaria.transacoes){
            System.out.println("ID: " + transacao.id);
            System.out.println("Tipo: " + transacao.tipo);
            System.out.println("Valor: " + transacao.valor);
            System.out.println("DataHora: " + transacao.dataHora);
            System.out.println("Status: " + transacao.status);

        }    

    }
}
