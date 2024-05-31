package List.OperacoesBasica;

public class Tarefa {
    // Atributo
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao ;
    }

    public boolean isConcluida() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isConcluida'");
    }

    public void marcarConcluida() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'marcarConcluida'");
    }

    public void marcarPendente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'marcarPendente'");
    }
    
    
}
