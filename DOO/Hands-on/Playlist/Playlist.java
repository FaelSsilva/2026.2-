import java.util.ArrayList;

class Playlist {
    String nome;
    ArrayList<Musica> musicas = new ArrayList<>();

    public void musicasPlaylist(){
        System.out.println(musicas.size());    
    }
}
