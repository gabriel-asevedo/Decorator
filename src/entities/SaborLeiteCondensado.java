package entities;

import service.Adicional;

public class SaborLeiteCondensado extends BaseDecorator {

    public SaborLeiteCondensado(Adicional wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Leite Condensado";
    }

    @Override
    public double custo() {
        double custoAdicional = switch (getTamanho()) {
            case PEQUENO -> 1.50;
            case MEDIO -> 2.00;
            case GRANDE -> 2.50;
        };
        return wrappee.custo() + custoAdicional;
    }
}
