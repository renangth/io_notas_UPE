package br.upe.nivel1;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraNotas {
    private List<Double> notas = new ArrayList<>();

    public void adicionarNota(double nota) {
        notas.add(nota);
    }
    public int quantidadeNotas() {
        return notas.size();
    }
    public double calcularMedia() {
        if (notas.isEmpty()) return 0.0;
        double soma = 0;
        for (double n : notas) soma += n;
        return soma / notas.size();
    }
}
