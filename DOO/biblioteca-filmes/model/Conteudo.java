package model; 

public abstract class Conteudo{
    private String titulo;
    private double anoLancamento;
    private String genero;

    public Conteudo(String titulo, double anoLancamento, String genero) throws Exception{
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
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

    public double getanoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(double anoLancamento) throws Exception{
        if(anoLancamento <= 0 ){
            throw new Exception("anoLancamento deve ser maior que 0");
        }
        this.anoLancamento = anoLancamento;
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

    public String paraString();


}