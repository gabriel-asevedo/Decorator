package entities;

import service.Adicional;

public class SaborBanana extends BaseDecorator {

    public SaborBanana(Adicional wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Banana";
    }

    @Override
    public double custo() {
        double custoAdicional = switch (getTamanho()) {
            case PEQUENO -> 1.00;
            case MEDIO -> 1.50;
            case GRANDE -> 2.00;
        };
        return wrappee.custo() + custoAdicional;
    }
}
