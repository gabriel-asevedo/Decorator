package entities;

import service.Adicional;

public class Acai implements Adicional {
    private Tamanho tamanho = null;

    public Acai() {
    }
    public Acai(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return "Açaí " + tamanho.toString().toLowerCase();
    }

    @Override
    public double custo() {
        return switch (tamanho) {
            case MEDIO -> 7.00;
            case GRANDE -> 9.00;
            default -> 5.00;
        };
    }

    public Tamanho getTamanho() {
        return tamanho;
    }
}

