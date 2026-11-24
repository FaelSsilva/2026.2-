package venda;

import java.util.ArrayList;

public class Venda {
    private String id;
    private ArrayList<ItemVenda> itens;

    public Venda(String id) {
        this.id = id;
        this.itens = new ArrayList<>();
    }

    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }



    public ArrayList<ItemVenda> getItens() {
        return itens;
    }



    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }

    public double getValorTotal() {
        double total = 0;
        for (ItemVenda item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void adicionarItem(ItemVenda item){
        this.itens.add(item);
    }

    public void resumo(){
        System.out.println("=== RESUMO DA VENDA ID: " + id + " ===");
        System.out.printf("%-15s | %-10s | %-10s | %-10s%n", "Produto", "Qtd", "Preço Un.", "Subtotal");
        System.out.println("---------------------------------------------------------");
        
        for (ItemVenda item : itens) {
            System.out.printf("%-15s | %-10d | R$ %-7.2f | R$ %-7.2f%n", 
                item.getProduto().getNome(), 
                item.getQuantidade(), 
                item.getProduto().getPreco(), 
                item.getSubtotal()
            );
        }
        
        System.out.println("---------------------------------------------------------");
        System.out.printf("VALOR TOTAL DA VENDA: R$ %.2f%n", getValorTotal());
        System.out.println("=========================================");
    }

}
