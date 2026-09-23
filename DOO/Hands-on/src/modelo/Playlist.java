package modelo;
import java.util.ArrayList;


public class Playlist {
    private String nome;
    private ArrayList<Musica> musicas = new ArrayList<>();

    
    public Playlist(String nome){
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public String nome(){
        return nome;
    }

    public void setNome(String nome){
        if(nome.trim().isEmpty()){
            System.out.println("O nome da sua playlist não pode estar vazio");
            return;
        }else{
            this.nome = nome;
        }
    }

    //Metodo para adicionar musica na playlist
    public void adicionarMusica(Musica musica){
        this.musicas.add(musica);
        System.out.println("Musica adicionada com sucesso á playlist");
    }

    //metodo mostrar quantas musicas existem na playlist
    public void musicasPlaylist(){
        System.out.println(musicas.size());    
    }
    //metodo para mostrar qual a primeira musica da playlist
    public void primeiraMusica(){
        if (musicas.size() != 0) {
        Musica primeira = musicas.get(0);
        System.out.println("Primeira musica da playlist: " + primeira.getTitulo());   
        } else {
            System.out.println("Sua playlist está vazia");
        }
    }
    //metodo para verificar se musica está na playlist
    public void verificacao(Musica musica) {
        if (musicas.contains(musica)) {
            System.out.println("A música está na playlist.");
        } else {
            System.out.println("A música não está na playlist.");
        }
    }

    //metodo para remover musica da playlist
    public void removerMusica(Musica musica){
       if (this.musicas.remove(musica)) {
            System.out.println("Musica removida da playlist");
       } else {
            System.out.println("Musica nao está na playlist");
       }
    }

}
