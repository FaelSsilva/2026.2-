package Venda;
import java.util.ArrayList;

import Carro.Carro;

public class Venda {
    private ArrayList<Carro> carros = new ArrayList<>();


    //getters e setters 
    //metodo para adicionar carro na lista
    public ArrayList<Carro> getCarros(){
            return this.carros;
    }

    //metodo para pegar carro
    public void setCarros(ArrayList<Carro> carros){
        this.carros = carros;
    }

    //metodo para adicionar carro de uma vez
    public void adicionarCarro(Carro carro){
        carros.add(carro);
    }
}
