import java.util.ArrayList;

class Playlist {
    String nome;
    ArrayList<Musica> musicas = new ArrayList<>();

    public void musicasPlaylist(){
        System.out.println(musicas.size());    
    }

    public void primeiraMusica(){
        Musica primeira = musicas.get(0);
        System.out.println("Primeira musica da playlist: " + primeira.titulo);
    }
}
