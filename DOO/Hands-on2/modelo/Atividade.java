package modelo;

public class Atividade {
    private String codigo;
    private String titulo;
    private double duracao;

    public Atividade(String codigo, String titulo, double duracao){
        codigo = this.codigo;
        titulo = this.titulo;
        duracao = this.duracao;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getDuracao() {
        return duracao;
    }
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

}
