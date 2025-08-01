package atividade3;

public class CadastroProduto {
    
    public static void main(String[] args) {
        Produto produto1 = new Produto(27, "Milho de pipoca", "Yoki", "20230001", 4.00  ); 

        Produto produto2 = new Produto(31, "Guarana", "Antartica","20230002", 10.00 );

        Produto produto3 = new Produto();
        produto3.id = 42;
        produto3.nome = "Limao";
        produto3.descricao = "Siciliano";
        produto3.codigoBarras = "20230003"; 
        produto3.valor = 8.00; 

        produto1.imprimir();
        produto2.imprimir();
        produto3.imprimir();

       
    }
}

