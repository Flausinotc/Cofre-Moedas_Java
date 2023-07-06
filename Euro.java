package empresa;

public class Euro extends Moeda {
    public Euro(double valor) {
        super(valor, "Euro");
    }

    @Override
    public double converterParaReal() {
        
        return getValor() * 5.35; //Coloquei o valor atual da moeda
    }
}