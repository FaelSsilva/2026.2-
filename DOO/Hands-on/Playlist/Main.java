
public class Main {
    public static void main(String[] args){
        Musica musica1 = new Musica("A morte do autotune", "Matuê", 201.6);
        Musica musica2 = new Musica("Honey Babe", "Matuê", 153.6);
        Musica musica3 = new Musica("DNA", "Ryu The Runner", 135);

        //mostrando informacoes da musica 1
        musica1.exibirInformacoes();

        //curtindo a musica 2
        musica2.curtir();
        //mostrando informacoes apos curtir
        musica2.exibirInformacoes();
        //descurtindo musica 2
        musica2.descurtir();
        //mostrando informacoes apos tirar curtida
        musica2.exibirInformacoes();

        musica3.duracaoMinutos();
    }
}
