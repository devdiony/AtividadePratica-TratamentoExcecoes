/**
 * Tutorial Prático - Tratamento de Exceções em Java
 * Professor: Thalles Bruno Gonçalves.
 * Aluno: Diony Tarso Ferreira Filho.
 /**
 * Classe de cadastro.
 * Contém a lógica de negócio para validar e cadastrar um cliente.
 */
public class CadastroCliente {

    /**
     * Valida os dados e cadastra o cliente.
     * @param nome Nome do cliente.
     * @param idade Idade do cliente.
     * @throws DadosInvalidosException Se o nome for nulo/vazio ou a idade for menor que 18.
     */
    void cadastrar(String nome, int idade) throws DadosInvalidosException {

        // Validação dos dados de entrada
        if (nome == null || nome.trim().isEmpty() || idade < 18) {
            // Lança a exceção personalizada se os dados forem inválidos
            throw new DadosInvalidosException("Nome não pode ser vazio e idade deve ser maior que 18.");
        }

        System.out.println("Cliente cadastrado com sucesso!");
    }
}

