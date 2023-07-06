package empresa;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
    private List<Moeda> moedas;

    public Cofrinho() {
        // Inicializa a lista de moedas como uma ArrayList vazia
        moedas = new ArrayList<>();
    }

    public void adicionarMoeda(Moeda moeda) {
        // Adiciona uma moeda à lista de moedas do cofrinho
        moedas.add(moeda);
    }

    public void removerMoeda(Moeda moeda) {
        // Remove uma moeda da lista de moedas do cofrinho
        moedas.remove(moeda);
    }

    public List<Moeda> getMoedas() {
        // Retorna a lista de moedas do cofrinho
        return moedas;
    }

    public void listarMoedas() {
        System.out.println("Moedas no cofrinho:");
        for (Moeda moeda : moedas) {
            // Itera sobre as moedas e exibe o país e valor de cada uma
            System.out.println(moeda.getPais() + " - " + moeda.getValor());
        }
    }

    public double calcularTotalEmReal() {
        double total = 0.0;
        for (Moeda moeda : moedas) {
            // Itera sobre as moedas e converte cada uma para o valor equivalente em Real
            total += moeda.converterParaReal();
        }
        return total;
    }
}
