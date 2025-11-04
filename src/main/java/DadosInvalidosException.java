/**
 * Tutorial Prático - Tratamento de Exceções em Java
 * Professor: Thalles Bruno Gonçalves.
 * Aluno: Diony Tarso Ferreira Filho.
 /**
 * Classe de exceção personalizada.
 * Define uma exceção que será lançada quando os dados de cadastro
 * (nome, idade) não forem válidos.
 */
public class DadosInvalidosException extends Exception {

    public DadosInvalidosException(String mensagem) {
        // Passa a 'mensagem' para o construtor da superclasse 'Exception'
        super(mensagem);
    }
}
