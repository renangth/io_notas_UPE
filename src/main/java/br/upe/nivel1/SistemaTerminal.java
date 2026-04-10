package br.upe.nivel1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaTerminal {
    private Scanner scanner;
    private CalculadoraNotas calculadora;

    public SistemaTerminal() {
        // TO-DO: Inicialize o Scanner para ler System.in
        this.scanner = new Scanner(System.in);
        this.calculadora = new CalculadoraNotas();
    }

    public void iniciar() {
        boolean continuar = true;
        System.out.println("--- Terminal de Notas ---");
        
        // TO-DO: Inicie o bloco do-while
        do {
            System.out.print("Digite uma nota (ou -1 para sair): ");
            
            // TO-DO: Inicie o bloco try
            try {
                double nota = scanner.nextDouble();
                
                if (nota == -1) {
                    continuar = false;
                } else if (nota >= 0 && nota <= 10) {
                    calculadora.adicionarNota(nota);
                    System.out.println("Nota salva.");
                } else {
                    System.out.println("A nota deve ser entre 0 e 10.");
                }
            } 
            // TO-DO: Capture a exceção InputMismatchException
            catch (Exception e) {
                System.out.println("Erro: Entrada inválida. Digite números!");
                scanner.nextLine(); // Limpa buffer
            }
            
        } while (continuar); // TO-DO: Feche o while
        
        exibirResumo();
        fecharRecursos();
    }

    private void exibirResumo() {
        System.out.println("\nQuantidade de notas: " + calculadora.quantidadeNotas());
        System.out.println("Média: " + calculadora.calcularMedia());
        System.out.print("Gráfico: ");
        // TO-DO: Complete o laço for
        for (int i = 0; i < calculadora.quantidadeNotas(); i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private void fecharRecursos() {
        // TO-DO: finally para fechar scanner
        try {
            System.out.println("Fim.");
        } finally {
            if (scanner != null) scanner.close();
        }
    }
}
