package List.OperacoesBasica.CarrinhoDeCompras.Pesquisa.Ordenacao;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class Pessoa implements Comparable<Pessoa> {
    // Atributos

    private String nome;

    public String getNome() {
        return nome;
    }

    private int idade;

    public int getIdade() {
        return idade;
    }

    private double altura;

    public double getAltura() {
        return altura;
    }

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    @Override
    public int compareTo(Pessoa p) {
        // TODO Auto-generated method stub
      return Integer.compare(idade, p.getIdade());
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }

   
   
    }


    
        
    class ComparatorPorAltura implements Comparator<Pessoa> {

        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            // TODO Auto-generated method stub
            return Double.compare(p1.getAltura(), p2.getAltura());
        }
        
    }
    


