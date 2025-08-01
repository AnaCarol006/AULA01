package simulado01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CadastroApp {
    
    public static void main(String[] args) {
        Musica music1 = new Musica(12, "Sozinho", "Caetano Veloso", 200, "MPB\n");
        Musica music2 = new Musica();
        Musica music3 = new Musica();
        Playlist playlist = new Playlist();

        music2.id = 20;
        music2.titulo = "Na Na Na";
        music2.artista = "Now United";
        music2.duracaoSeg = 180;
        music2.genero = "Pop\n";

        music3.id = 21;
        music3.titulo = "Eu Amo Voce";
        music3.artista = "Tim Maia";
        music3.duracaoSeg = 124;
        music3.genero = "MPB\n";


        List<Musica> listaMusicas = new ArrayList<>();
        listaMusicas.add(music1);
        listaMusicas.add(music2);
        listaMusicas.add(music3);


        playlist.id = 207;
        playlist.nome = "All the feels";
        playlist.publica = false;
        playlist.totalMusicas = 37;
        playlist.duracaoTotalSeg = 45080;
        playlist.dataCriacao = LocalDateTime.now();
        playlist.musicas = List.of(music1, music2, music3);
        


        System.out.println("\n*** PLAYIST ***");
        System.out.println("ID: " + playlist.id);
        System.out.println("Nome: " + playlist.nome);
        System.out.println("Publica: " + playlist.publica);
        System.out.println("TotalMusicas: " + playlist.totalMusicas);
        System.out.println("DuracaoTotalSeg: " + playlist.duracaoTotalSeg);
        System.out.println("DataCriacao: " + playlist.dataCriacao);


        System.out.println("\nMusicas: ");

        for (Musica musica : playlist.musicas){
            System.out.println("ID: " + musica.id);
            System.out.println("titulo: " + musica.titulo);
            System.out.println("artista" + musica.artista);
            System.out.println("DuracaoSeg: " + musica.duracaoSeg);
            System.out.println("Genero: " + musica.genero);


        }    
    }    
}
    