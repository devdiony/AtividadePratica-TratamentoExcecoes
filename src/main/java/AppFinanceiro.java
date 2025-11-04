/**
 * Tutorial Prático - Tratamento de Exceções em Java
 * Professor: Thalles Bruno Gonçalves.
 * Aluno: Diony Tarso Ferreira Filho.
 /**
 * Classe principal com o "Desafio Extra" implementado.
 * Os erros agora são registrados em 'log_erros.txt'.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class AppFinanceiro {

    // Método de logging para o desafio
    private static void logError(String mensagem) {
        // Usamos try-with-resources para garantir que o FileWriter e PrintWriter
        // sejam fechados automaticamente, mesmo se ocorrer um erro.
        // O 'true' no FileWriter indica que queremos adicionar (append) ao arquivo,
        // e não sobrescrevê-lo.
        try (FileWriter fw = new FileWriter("log_erros.txt", true);
             PrintWriter pw = new PrintWriter(fw)) {

            pw.println(new Date() + " - ERRO: " + mensagem);

        } catch (IOException e) {
            // Se o próprio log falhar, informamos no console
            System.out.println("ERRO CRÍTICO: Falha ao escrever no arquivo de log.");
            e.printStackTrace();
        }
    }

    // Método de cálculo modificado para chamar o log
    static double calcularDivisao(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }
            return a / b;

        } catch (ArithmeticException e) {
            String msgErro = "Divisão por zero não é permitida.";
            System.out.println("Erro: " + msgErro);
            logError(msgErro); // Chama o método de log
            return 0;

        } finally {
            System.out.println("Operação finalizada com sucesso.");
        }
    }

    // Método main modificado para chamar o log
    public static void main(String[] args) {
        // Testando cálculo
        System.out.println("Teste 1: Divisão normal");
        double resultado = calcularDivisao(10, 2);
        System.out.println("Resultado: " + resultado + "\n");

        System.out.println("Teste 2: Divisão por zero");
        calcularDivisao(10, 0);
        System.out.println();

        // Testando cadastro
        CadastroCliente cadastro = new CadastroCliente();
        try {
            System.out.println("Tentando cadastrar cliente...");
            cadastro.cadastrar("", 16);
        } catch (DadosInvalidosException e) {
            String msgErro = e.getMessage();
            System.out.println("Erro: " + msgErro);
            logError(msgErro); // Chama o método de log
        }
    }
}

