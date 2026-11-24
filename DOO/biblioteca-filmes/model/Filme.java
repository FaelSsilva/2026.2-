package model;

public class Filme extends Conteudo{
    private int duracaoMinutos;

    public int getDuracaoEmMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoMinutos) throws Exception {
        if (!(duracaoMinutos < 0))
            this.duracaoMinutos = duracaoMinutos;
        else
            throw new Exception("Número inválido!");
    }

    public Filme(String titulo, double anoLancamento, String genero) throws Exception{
        super(titulo, anoLancamento, genero);
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String paraString() {
        String saida = "Titulo: " + this.getTitulo() + "\nGênero: " + this.getGenero() + "\nAno  lançamento: "
                + this.getAnoLancamento() + "\nDuração em minutos: " + this.getDuracaoEmMinutos() + " minutos";
                
        return saida;
    }
}