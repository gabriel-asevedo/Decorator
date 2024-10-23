package tests;

import entities.*;
import service.Adicional;

public class TestaDecoratorComTamanhos {

    public static void main(String[] args) {
        
        Adicional acaiPequenoComMorango = new SaborMorango(new Acai(Tamanho.PEQUENO));
        System.out.println(acaiPequenoComMorango.getDescricao() + " - Custo: R$ " + acaiPequenoComMorango.custo());

        Adicional acaiMedioCompleto = new SaborMorango(new SaborLeiteCondensado(new Acai(Tamanho.MEDIO)));
        System.out.println(acaiMedioCompleto.getDescricao() + " - Custo: R$ " + acaiMedioCompleto.custo());

        Adicional acaiGrandeCompleto = new SaborMorango(new SaborLeiteCondensado(new SaborBanana(new Acai(Tamanho.GRANDE))));
        System.out.println(acaiGrandeCompleto.getDescricao() + " - Custo: R$ " + acaiGrandeCompleto.custo());
    }
}
