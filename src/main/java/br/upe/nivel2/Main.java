package br.upe.nivel2;

public class Main {
    public static void main(String[] args) {
        testarCalculadora();

        System.out.println("\nIniciando sistema para o usuário...");
        SistemaTerminal sistema = new SistemaTerminal();
        sistema.iniciar();
    }

    public static void testarCalculadora() {
        System.out.println("--- Executando Teste Interno ---");
        CalculadoraNotas calc = new CalculadoraNotas();
        
        // TO-DO: Adicione as notas 8.0 e 10.0
        CalculadoraNotas teste = new CalculadoraNotas();
        teste.adicionarNota(8.0);
        teste.adicionarNota(10.0);
        // TO-DO: Calcule a média
        teste.calcularMedia();
        // TO-DO: Crie um if/else completo verificando se a média é 9.0
        if (teste.calcularMedia() == 9.0) {
            System.out.println("✅ PASSOU");
        }
        // Imprima "✅ PASSOU" ou "❌ FALHOU"
        else {
            System.out.println("❌ FALHOU");
        }
        
    }
}
