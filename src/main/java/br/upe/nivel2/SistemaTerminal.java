package br.upe.nivel2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaTerminal {
    private Scanner scanner;
    private CalculadoraNotas calculadora;

    public SistemaTerminal() {
        this.scanner = new Scanner(System.in);
        this.calculadora = new CalculadoraNotas();
    }

    public void iniciar() {
        boolean continuar = true;
        System.out.println("--- Terminal de Notas ---");
        
        // TO-DO: Escreva o laço 'do-while' completo
        // Dentro do 'do', escreva o bloco 'try-catch'
        // No 'try', leia o nextDouble(). Avalie: se -1 (sai), se entre 0 e 10 (salva), se não (erro).
        // No 'catch', capture InputMismatchException e limpe o buffer com nextLine()
        do {
            System.out.println("Digite uma nota (de 0 a 10) ou -1 para sair: ");
            try {
                double EscolhaNota = scanner.nextDouble();
                if (EscolhaNota == -1){
                    System.out.println("Saindo");
                    continuar = false;
                }else if ((EscolhaNota <= 10 && EscolhaNota >= 0)) {
                    calculadora.adicionarNota(EscolhaNota);
                    System.out.println("Nota salva!");
                } else {
                    System.out.println("Nota nao salva, digite uma nota de 0 a 10");
                }
                }catch (Exception e) {
                System.out.println("Erro! Digite um note em numero fracional");
                scanner.nextLine();
            }
        } while (continuar);
        
        exibirResumo();
        fecharRecursos();
    }

    private void exibirResumo() {
        System.out.println("\nQuantidade de notas: " + calculadora.quantidadeNotas());
        System.out.println("Média: " + calculadora.calcularMedia());
        System.out.print("Gráfico: ");
        
        // TO-DO: Escreva o laço for completo para imprimir '*'
        for (int i = 0; i < calculadora.quantidadeNotas(); i++) {
            System.out.print("*");
        }
        System.out.println();

    }

    private void fecharRecursos() {
        // TO-DO: Escreva o bloco try-finally completo para fechar o scanner
        try {
            System.out.println("Fim");
        }finally {
            scanner.close();
        }
    }
}
