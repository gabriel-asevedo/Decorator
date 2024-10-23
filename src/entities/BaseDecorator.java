package entities;

import service.Adicional;

public abstract class BaseDecorator implements Adicional {
    protected Adicional wrappee;

    public BaseDecorator(Adicional wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao();
    }

    @Override
    public double custo() {
        return wrappee.custo();
    }

    public Tamanho getTamanho() {
        if (wrappee instanceof Acai) {
            return ((Acai) wrappee).getTamanho();
        } else if (wrappee instanceof BaseDecorator) {
            return ((BaseDecorator) wrappee).getTamanho();
        }
        return null;
    }
}
