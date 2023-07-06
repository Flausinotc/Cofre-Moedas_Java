package empresa;

public class Moeda {
    protected double valor; // Valor da moeda (Protegido)
    protected String pais; // País da moeda

    public Moeda(double valor, String pais) {
        this.valor = valor;
        this.pais = pais;
    }

    public double getValor() {
        return valor;
    }

    public String getPais() {
        return pais;
    }

    public double converterParaReal() {
        return valor; // Retorna o valor da moeda (não faz conversão)
    }
}
