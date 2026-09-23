package modelo;

public class Musica{
    private String titulo;
    private String artista;
    private double duracaoSeg;
    private boolean curtida;

    //get
    public String getTitulo(){
        return titulo;
    }

    public String getArtista(){
        return artista;
    }

    public double getDuracaoSeg(){
        return duracaoSeg;
    }

    //set
    public void setTitulo(String titulo){
        if(titulo.trim().isEmpty()){
            System.out.println("O titulo nao deve estar vazio!");
            return;
        } else{
            this.titulo = titulo;
        }
    }

    public void setArtista(String artista){
        if(artista.trim().isEmpty()){
            System.out.println("Artista nao deve estar vazio");
            return;
        }else{
            this.artista = artista;
        }
    }

    public void setDuracaoSeg(double duracaoSeg){
        if(duracaoSeg <= 0){
            System.out.println("A duracao em seg deve ser preenchida");
            return;
        }else{
            this.duracaoSeg = duracaoSeg;
        }
    }

    //metodo criar musica
    public Musica(String titulo, String artista, double duracaoSeg){
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSeg = duracaoSeg;
        this.curtida = false;
    }   

    //metodo para exibir informacoes das musicas + duracao da musica em minutos
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
    //metodo para converter segundos em minutos
    public double duracaoMinutos(){
        double minutos = this.duracaoSeg / 60;
        return minutos;
    }


}
