package empresa;

public class Real extends Moeda {
    public Real(double valor) {
        super(valor, "Real");
    }

    @Override
    public double converterParaReal() {
        return getValor();
    }
}