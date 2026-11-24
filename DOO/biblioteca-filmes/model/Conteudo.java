package model; 

public abstract class Conteudo{
    private String titulo;
    private double duracao;
    private String genero;

    public Conteudo(String titulo, double duracao, String genero) throws Exception{
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws Exception{
        if (titulo.trim().isBlank()) {
            throw new Exception("Titulo não pode ficar vazio!");
        }
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) throws Exception{
        if(duracao <= 0 ){
            throw new Exception("Duracao deve ser maior que 0 minutos");
        }
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) throws Exception{
        if(genero.trim().isBlank()){
            throw new  Exception("Genero não pode ficar vazio");
        }
        this.genero = genero;
    }

}