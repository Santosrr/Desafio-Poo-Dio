package List.OperacoesBasica.CarrinhoDeCompras.Pesquisa.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
// Atributos
private long codigo;
private String nome;
private double preco;
private int quantidade;

public Produto(long codigo, String nome, double preco, int quantidade) {
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
}
@Override
public int compareTo(Produto p) {
    // TODO Auto-generated method stub
    return nome.compareToIgnoreCase(p.getNome());
}

public long getCodigo() {
    return codigo;
}

public String getNome() {
    return nome;
}

public double getPreco() {
    return preco;
}

public int getQuantidade() {
    return quantidade;
}


@Override
public int hashCode() {
    final int prime = 31;
    long result = 1;
    result = prime * result + (long) (codigo ^ (codigo >>> 32));
    return (int) result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Produto other = (Produto) obj;
    if (codigo != other.codigo)
        return false;
    return true;
}

@Override
public String toString() {
    return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
}
}
class ComparetorPorPreco implements Comparator<Produto> {

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public int compare(Produto p1, Produto p2) {
        // TODO Auto-generated method stub
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

} 
