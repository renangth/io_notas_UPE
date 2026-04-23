package br.upe.nivel3;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraNotas {
    private List<Double> notas = new ArrayList<>();

    public void adicionarNota(double nota) {
        // Implemente
        notas.add(nota);
    }
    
    public int quantidadeNotas() {
        // Implemente
        return notas.size();
    }
    
    public double calcularMedia() {
        // Implemente a lógica de média (cuidado com divisão por zero)
        double soma = 0;
        if (notas.isEmpty()){
            return 0.0;
        } else{
            for (double n : notas) soma += n;
            return soma / notas.size();
        }

    }
}
