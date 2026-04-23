package br.upe.nivel3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaTerminal {
    private Scanner scanner;
    private CalculadoraNotas calculadora;

    public SistemaTerminal() {
        // Implemente a inicialização
       this.scanner = new Scanner(System.in);
       this.calculadora = new CalculadoraNotas();
    }

    public void iniciar() {
        // Implemente o loop e o tratamento de erros completo
        boolean continuar = true;

        System.out.println("===== Sistema de calculadora de médias =====");
        do {
            System.out.println("Digite uma nota de 0 a 10 (-1 para sair)");
            try{
                double nota = scanner.nextDouble();
                if (nota == -1) {
                    continuar = false;
                } else if (nota >= 0 && nota <= 10) {
                    System.out.println("Nota salva!");
                    calculadora.adicionarNota(nota);
                } else{
                    System.out.println("Digite uma nota de 0 a 10");
                }
            } catch (Exception e) {
                System.out.println("Digite um número válido!");
                scanner.nextLine();
            }
        } while (continuar);
        exibirResumo();
        fecharRecursos();
    }

    private void exibirResumo() {
        // Implemente a exibição e o loop for
        System.out.println("Quantidade de notas: " + calculadora.quantidadeNotas());
        System.out.println("Média dos alunos: " + calculadora.calcularMedia());
        System.out.print("Gráfico: ");
        for (int i = 0; i < calculadora.quantidadeNotas(); i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    private void fecharRecursos() {
        // Implemente o fechamento seguro do Scanner
        try {
            System.out.println("Fim!");
        } finally {
            scanner.close();
        }
    }
}
