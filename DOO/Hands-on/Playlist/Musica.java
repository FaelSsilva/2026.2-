class Musica{
    String titulo;
    String artista;
    double duracaoSeg;
    boolean curtida;

    Musica(String titulo, String artista, double duracaoSeg){
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSeg = duracaoSeg;
        this.curtida = false;
    }   

    public void exibirInformacoes(){
        System.out.println("Nome da musica: " + titulo);
        System.out.println("Nome do artista: " + artista);
        System.out.println("Duracao da musica em segundos: " + duracaoSeg + "seg");
        System.out.println("Duração da musica em minutos: " + duracaoMinutos()+ "min");
        System.out.println("Curtida: " + curtida);
        System.out.println("---------------------------");
    }

    public void curtir(){
        this.curtida = true;
    }

    public void descurtir(){
        this.curtida = false;
    }

    public double duracaoMinutos(){
        double minutos = this.duracaoSeg / 60;
        return minutos;
    }


}
