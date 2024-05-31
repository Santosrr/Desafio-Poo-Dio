package List.OperacoesBasica.CarrinhoDeCompras.Pesquisa;

import java.util.HashSet;
import java.util.Set;

import List.OperacoesBasica.Tarefa;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }
    public void removerTarefa(String descricao) {
        tarefas.remove(new Tarefa(descricao));
    }

    public void exibirTarefas() {
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    public int contarTarefas() {
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> concluidas = new HashSet<>();
        for (Tarefa tarefa : tarefas) {
            if (tarefa.isConcluida()) {
                concluidas.add(tarefa);
            }
        }
        return concluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> pendentes = new HashSet<>();
        for (Tarefa tarefa : tarefas) {
            if (!tarefa.isConcluida()) {
                pendentes.add(tarefa);
            }
        }
        return pendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.marcarConcluida();
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.marcarPendente();
                break;
            }
        }
    }

    public void limparListaTarefas() {
        tarefas.clear();
    }
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionar tarefas
        listaTarefas.adicionarTarefa("Estudar para a prova");
        listaTarefas.adicionarTarefa("Comprar mantimentos");
        listaTarefas.adicionarTarefa("Limpar a casa");

        // Exibir todas as tarefas
        System.out.println("Tarefas na lista:");
        listaTarefas.exibirTarefas();

        // Marcar tarefa como concluída
        listaTarefas.marcarTarefaConcluida("Comprar mantimentos");

        // Exibir tarefas concluídas e pendentes
        System.out.println("\nTarefas concluídas:");
        for (Tarefa tarefa : listaTarefas.obterTarefasConcluidas()) {
            System.out.println(tarefa);
        }

        System.out.println("\nTarefas pendentes:");
        for (Tarefa tarefa : listaTarefas.obterTarefasPendentes()) {
            System.out.println(tarefa);
        }

        // Contar total de tarefas
        System.out.println("\nTotal de tarefas: " + listaTarefas.contarTarefas());

        // Remover uma tarefa
        listaTarefas.removerTarefa("Limpar a casa");
        System.out.println("\nTarefas após remover 'Limpar a casa':");
        listaTarefas.exibirTarefas();

        // Limpar todas as tarefas
        listaTarefas.limparListaTarefas();
        System.out.println("\nTarefas após limpar a lista:");
        listaTarefas.exibirTarefas();
    }
    private void adicionarTarefa(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarTarefa'");
    }
    }