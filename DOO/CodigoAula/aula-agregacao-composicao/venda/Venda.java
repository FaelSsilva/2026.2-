package venda;

import java.util.ArrayList;

public class Venda {
    private String id;
    private ArrayList<ItemVenda> itens;

    public Venda(String id) {
        this.id = id;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemVenda item) {
        this.itens.add(item);
    }

    public void resumo() {
        System.out.println("Resumo da venda: " + this.id);

        double total = 0.0;
        for (ItemVenda item : this.itens) {
            double subtotal = item.getProduto().getPreco() * item.getQuantidade();
            System.out.println(item.getProduto().getNome() + " x " + item.getQuantidade() + " = R$ " + subtotal);
            total += subtotal;
        }

        System.out.println("Total: R$ " + total);
    }
}
