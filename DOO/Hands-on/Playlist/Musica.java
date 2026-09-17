class AddMusica{
    String titulo;
    String artista;
    double duracaoSeg;
    boolean curtida;

    AddMusica(String titulo, String artista, double duracaoSeg, boolean curtida){
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSeg = duracaoSeg;
        this.curtida = curtida;
    }   

    public void ExibirInformacoes(){
        System.out.println("Nome da musica: " + titulo);
        System.out.println("Nome do artista: " + artista);
        System.out.println("Duracao da musica em segundos: " + duracaoSeg + "seg");
        System.out.println("Curtida: " + curtida);
    }

    public void curtir(){
        this.curtida = true;
    }

    public void descurtir(){
        
    }




}
