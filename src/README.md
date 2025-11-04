Tutorial Prático – Tratamento de Exceções em Java

Este repositório contém a resolução da atividade prática sobre tratamento de exceções em Java. O projeto simula um pequeno sistema financeiro que lida com divisões e cadastro de clientes, implementando try-catch-finally e exceções personalizadas.

Estrutura do Projeto

AppFinanceiro.java: Classe principal que contém o método main e o método calcularDivisao(). Ela é responsável por executar os testes e capturar as exceções.

CadastroCliente.java: Classe que contém a lógica de negócio para cadastrar um cliente, validando nome e idade.

DadosInvalidosException.java: Classe de exceção personalizada (checked exception) que herda de Exception, lançada quando os dados do cliente são inválidos.

log_erros.txt: Arquivo de log gerado automaticamente que registra todas as exceções capturadas durante a execução.

Saída do Console 

Teste 1: Divisão normal
Operação finalizada com sucesso.
Resultado: 5.0

Teste 2: Divisão por zero
Erro: Divisão por zero não é permitida.
Operação finalizada com sucesso.

Tentando cadastrar cliente...
Erro: Nome não pode ser vazio e idade deve ser maior que 18.


Qual a importância do tratamento de exceções em um sistema orientado a objetos?

O tratamento de exceções é vital em um sistema orientado a objetos porque garante a robustez da aplicação, impedindo que erros inesperados (como uma divisão por zero ou dados nulos) interrompam abruptamente o programa. Ele separa a lógica de negócio (o que o programa deve fazer, no bloco try) da lógica de tratamento de erros (o que fazer quando algo dá errado, no catch), tornando o código muito mais limpo, legível e fácil de manter. Além disso, o mecanismo de exceções permite que métodos comuniquem problemas de forma clara (usando throw) para quem os chamou, e a natureza da OO nos permite criar hierarquias de exceções personalizadas (como a DadosInvalidosException), tornando o tratamento de erros mais organizado e específico.