public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void play() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada.");
    }

    @Override
    public void stop() {
        System.out.println("Reprodução de música parada.");
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Realizando chamada...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Métodos adicionais que podem ser úteis
    @Override
    public String toString() {
        return "iPhone: Um dispositivo multifuncional.";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        // Aqui você pode adicionar comparação de atributos se necessário
        return true;
    }
    
    @Override
    public int hashCode() {
        // Aqui você pode adicionar um cálculo de hash code baseado em atributos
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
