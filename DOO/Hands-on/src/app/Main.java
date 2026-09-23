package app;
import modelo.Musica;
import modelo.Playlist;

public class Main {
    public static void main(String[] args){
        Musica musica1 = new Musica("A morte do autotune","Matuê", 180 );
        Musica musica2 = new Musica("DNA", "Ryu The Runner", 226);

        Playlist minhaPlaylist = new Playlist("Traps");

        minhaPlaylist.adicionarMusica(musica1);
        minhaPlaylist.adicionarMusica(musica2);

        

    } 
}
