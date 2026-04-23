package br.upe.nivel3;

import br.upe.nivel2.CalculadoraNotas;

public class Main {
    public static void main(String[] args) {
        testarCalculadora();

        System.out.println("\nIniciando sistema para o usuário...");
        SistemaTerminal sistema = new SistemaTerminal();
        sistema.iniciar();
    }

    public static void testarCalculadora() {
    	// Escreva o teste manual aqui
        CalculadoraNotas teste = new CalculadoraNotas();
        teste.adicionarNota(8);
        teste.adicionarNota(9);
        double notaTeste= teste.calcularMedia();
        if (notaTeste == 8.5) {
            System.out.println("Passou");
        } else {
            System.out.println("Reprovou no teste");
        }

    }
}
