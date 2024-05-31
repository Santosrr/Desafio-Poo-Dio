package List.OperacoesBasica.CarrinhoDeCompras.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    // Atributos
    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.exibirContatos();

        agendaContato.adicionarContato("Renato", 123456);
        agendaContato.adicionarContato("Renato", 0);
        agendaContato.adicionarContato("Renato Rodrigues", 111111);
        agendaContato.adicionarContato("Renato Aluno", 56789);
        agendaContato.adicionarContato("Maria Silva", 111111);

        agendaContato.exibirContatos();

        System.out.println(agendaContato.pesquisarPorNome("Renato"));
    }
}


