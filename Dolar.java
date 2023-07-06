package empresa;

public class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor, "Dolar");
    }

    @Override
    public double converterParaReal() {
        
        return getValor() * 4.97; //Coloquei o valor atual da moeda
    }
}