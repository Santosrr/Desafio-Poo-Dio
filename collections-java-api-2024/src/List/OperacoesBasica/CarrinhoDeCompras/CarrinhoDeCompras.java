package List.OperacoesBasica.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.Iterator;

public class CarrinhoDeCompras {
    private ArrayList<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        for (Item item : itens) {
            if (item.getNome().equals(nome)) {
                item.setQuantidade(item.getQuantidade() + quantidade);
                return;
            }
        }
        Item novoItem = new Item(nome, preco, quantidade);
        itens.add(novoItem);
    }

    public void removerItem(String nome) {
        Iterator<Item> iterator = itens.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getNome().equals(nome)) {
                iterator.remove();
                return;
            }
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        for (Item item : itens) {
            System.out.println("Nome: " + item.getNome() + ", Preço: " + item.getPreco() + ", Quantidade: " + item.getQuantidade());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Maçã", 0.5, 10);
        carrinho.adicionarItem("Banana", 0.3, 5);
        carrinho.adicionarItem("Laranja", 0.8, 2);

        System.out.println("Itens no carrinho:");
        carrinho.exibirItens();

        System.out.println("\nValor total: " + carrinho.calcularValorTotal());

        carrinho.removerItem("Banana");

        System.out.println("\nItens no carrinho após remover Banana:");
        carrinho.exibirItens();

        System.out.println("\nValor total após remoção: " + carrinho.calcularValorTotal());
    }
}