public class Main {
    public static void main (String[] args) {
        // criar carro
        Carro carro = new Carro();

        // criar porta
        Porta porta_dd = new Porta("dianteira", "direita");
        Porta porta_de = new Porta("dianteira", "esquerda");
        Porta porta_td = new Porta("traseira", "direita");
        Porta porta_te = new Porta("traseira", "esquerda");

        // adicionar porta ao carro
        carro.adicionarPorta(porta_dd);
        carro.adicionarPorta(porta_de);
        carro.adicionarPorta(porta_td);
        carro.adicionarPorta(porta_te);

        // criar roda
        Roda roda_dd = new Roda(18, "dianteira", "direita");
        Roda roda_de = new Roda(18, "dianteira", "esquerda");
        Roda roda_td = new Roda(18, "traseira", "direita");
        Roda roda_te = new Roda(18, "traseira", "esquerda");

        // adicionar roda ao carro
        carro.adicionarRoda(roda_dd);
        carro.adicionarRoda(roda_de);
        carro.adicionarRoda(roda_td);
        carro.adicionarRoda(roda_te);

        System.out.println( carro.mostrarInformacoes() );
    }
}
