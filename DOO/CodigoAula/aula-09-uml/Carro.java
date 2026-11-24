public class Carro {
    private Motor motor;
    private Porta[] portas;
    private Roda[] rodas;
    private int indicePorta;
    private int indiceRoda;

    public Carro(){
        this.portas = new Porta[4];
        this.indicePorta = 0;

        this.rodas = new Roda[4];
        this.indiceRoda = 0;
    }

    public void adicionarMotor(Motor motor){
        this.motor = motor;
    }

    public void adicionarPorta(Porta porta){
        this.portas[this.usarIndicePorta()] = porta;
    }

    private int usarIndicePorta(){
        return this.indicePorta++;
    }

    // Roda
        public void adicionarRoda(Roda roda){
        this.rodas[this.usarIndiceRoda()] = roda;
    }

    private int usarIndiceRoda(){
        return this.indiceRoda++;
    }

    public String mostrarInformacoes() {
        String info = "";
        
        info += "PORTAS \n";

        for (Porta porta : this.portas) {
            if ( porta != null) {
                info += porta.getLado() + " " + porta.getPosicao() + "\n"; 
            }
        }

        info += "\n\n";

        info += "RODAS \n";

        for (Roda roda : this.rodas) {
            if ( roda != null) {
                info += roda.getLado() + " " + roda.getPosicao() + "\n"; 
            }
        }

        return info;
    }
}
