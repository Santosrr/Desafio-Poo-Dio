## Projeto iPhone

Este projeto demonstra a implementação de um iPhone com funcionalidades de Reprodutor Musical, Aparelho Telefônico e Navegador na Internet usando programação orientada a objetos em Java. O projeto inclui um diagrama UML para ilustrar a estrutura das classes e interfaces.

## Diagrama UML
O diagrama UML a seguir representa as interfaces e a classe `iPhone`:

![Diagrama UML](uml_diagra![DIAGRAMA-CLASSES-INTERFACES-IPHONE](https://github.com/Santosrr/Desafio-Poo-Dio/assets/133519854/ff25995a-6419-4d04-8ef3-001d24d456e1)
m.png)


## Estrutura do Projeto

O projeto consiste em três interfaces e uma classe que implementa essas interfaces. Também inclui uma classe `Main` para demonstrar a funcionalidade.

### Interface `ReprodutorMusical`

```java
public interface ReprodutorMusical {
    void play();
    void pause();
    void stop();
}
Interface AparelhoTelefonico
java
Copy code
public interface AparelhoTelefonico {
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}
Interface NavegadorInternet
java
Copy code
public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}
Classe iPhone
java
Copy code
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
        iPhone iPhone = (iPhone) obj;
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
Classe Main
java
Copy code
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
Executando o Projeto
Compile todas as classes:

sh
Copy code
javac ReprodutorMusical.java AparelhoTelefonico.java NavegadorInternet.java iPhone.java Main.java
Execute a classe Main:

sh
Copy code
java Main
Você verá a saída demonstrando as funcionalidades implementadas para o iPhone.

Contribuição
Sinta-se à vontade para fazer um fork deste repositório e enviar pull requests. Se encontrar problemas, por favor, abra uma issue.

Licença
Este projeto é licenciado sob os termos da licença MIT. Veja o arquivo LICENSE para mais detalhes.

markdown
Copy code

### Instruções

1. **Adicionar Diagrama UML**: Substitua `![Diagrama UML](uml_diagram.png)` pela localização correta do seu diagrama UML ou inclua o diagrama no repositório com o nome `uml_diagram.png`.
2. **Compilação e Execução**: Siga as instruções para compilar e executar o código Java no seu ambiente de desenvolvimento.

Este arquivo `README.md` fornece uma visão geral do projeto, a estrutura das classes e interface

