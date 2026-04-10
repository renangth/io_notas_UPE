package br.upe.nivel1;

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
        calc.adicionarNota(8.0);
        calc.adicionarNota(10.0);
        
        double resultado = calc.calcularMedia();
        
        // TO-DO: Use um if para verificar se o resultado é exatamente 9.0
        if (resultado == 9.0) {
            System.out.println("✅ PASSOU");
        } else {
            System.out.println("❌ FALHOU");
        }
    }
}
