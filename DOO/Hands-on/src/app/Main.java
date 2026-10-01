package app;
import modelo.Musica;
import modelo.Playlist;

public class Main {
    public static void main(String[] args){
        Musica musica1 = new Musica("A morte do autotune","Matuê", 180 );
        Musica musica2 = new Musica("DNA", "Ryu The Runner", 226);
        Musica musica3 = new Musica("Romantic Homicide", "D4vd", 145);

        Playlist Playlist1 = new Playlist("Traps");
        Playlist Playlist2 = new Playlist("Musicas Curtidas");
        
        Playlist1.adicionarMusica(musica1);
        Playlist1.adicionarMusica(musica2);

        Playlist1.verificarVazia();
        
        Playlist2.verificarVazia();
        
        Playlist2.adicionarMusica(musica3);
    } 
}
