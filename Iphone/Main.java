public class Main {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Testando ReprodutorMusical
        meuIPhone.play();
        meuIPhone.pause();
        meuIPhone.stop();

        // Testando AparelhoTelefonico
        meuIPhone.ligar();
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuIPhone.exibirPagina("www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}


