package simulado01;

public class Musica {
    int id;
    String titulo;
    String artista;
    int duracaoSeg;
    String genero;


    
    public Musica(){
        System.out.println("chamou o contrutor vazio!");
    }

    public Musica(String titulo){
        this.titulo = titulo;
    }

    public Musica(int id, String titulo, String artista, int duracaoSeg, String genero){
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSeg = duracaoSeg;
        this.genero = genero;
    }
}
