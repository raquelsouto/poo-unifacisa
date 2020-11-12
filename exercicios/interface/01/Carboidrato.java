
public enum Carboidrato {

    FEIJAO(4.0),
    ARROZ(2.5),
    PURE(3.0),
    FRITAS(2.7),
    MACARRAO(3.4),
    BATATADOCE(3.5);

    private double valorDoCarboidrato;

    Carboidrato(double valorDoCarboidrato) {
        this.valorDoCarboidrato = valorDoCarboidrato;
    }

    public double getValorDoCarboidrato() {
        return valorDoCarboidrato;
    }

}

