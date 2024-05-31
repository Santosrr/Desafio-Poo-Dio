package List.OperacoesBasica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavrasUnicas.remove(palavra);
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        for (String palavra : palavrasUnicas) {
            System.out.println(palavra);
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        conjunto.adicionarPalavra("maçã");
        conjunto.adicionarPalavra("banana");
        conjunto.adicionarPalavra("laranja");
        
        System.out.println("Verificar se 'banana' está no conjunto: " + conjunto.verificarPalavra("banana"));  // true
        conjunto.exibirPalavrasUnicas();
        
        conjunto.removerPalavra("banana");
        System.out.println("Verificar se 'banana' está no conjunto: " + conjunto.verificarPalavra("banana"));  // false
        conjunto.exibirPalavrasUnicas();
    }
}