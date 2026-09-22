public class Main {
    public static void main(String[] args){
        Musica musica1 = new Musica("A morte do autotune", "Matuê", 201.6);
        Musica musica2 = new Musica("Honey Babe", "Matuê", 153.6);
        Musica musica3 = new Musica("DNA", "Ryu The Runner", 135);

        //criando playlist
        Playlist minhaPlaylist = new Playlist();
        minhaPlaylist.nome = "Musicas curtidas";
        //adicionando musicas ao array de playlist
        minhaPlaylist.musicas.add(musica1);
        minhaPlaylist.musicas.add(musica2);
        minhaPlaylist.musicas.add(musica3);

        minhaPlaylist.musicasPlaylist();
        System.out.println("-----------------");
        minhaPlaylist.primeiraMusica();
    }
}
