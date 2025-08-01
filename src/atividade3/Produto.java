package atividade3;

public class Produto {

    public int id;
    public String nome;
    public String descricao;
    public String codigoBarras;
    public double valor;
    
    public Produto(){
    }
    
    public Produto(int id, String nome, String descricao, String codigoBarras, Double valor){
        this.id = id;
        this.nome = nome;
		this.descricao = descricao;
		this.codigoBarras = codigoBarras;
        this.valor = valor;
	    
    }
    
    public void imprimir(){
        System.out.println("Id: " + this.id);
		System.out.println("Nome: " + this.nome);
        System.out.println("Descricao: " + this.descricao);
        System.out.println("CodigoBarras: " + this.codigoBarras);
        System.out.println("Valor: " + this.valor);
    }
    
}
    

