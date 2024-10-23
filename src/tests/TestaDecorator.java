package tests;

import entities.Acai;
import entities.SaborBanana;
import entities.SaborLeiteCondensado;
import entities.SaborMorango;
import service.Adicional;

public class TestaDecorator {

    public static void main(String[] args) {

        Adicional acaiSimples = new Acai();
        System.out.println(acaiSimples.getDescricao() + " - Custo: R$ " + acaiSimples.custo());

        Adicional acaiComMorango = new SaborMorango(acaiSimples);
        System.out.println(acaiComMorango.getDescricao() + " - Custo: R$ " + acaiComMorango.custo());

        Adicional acaiCompleto = new SaborMorango(new SaborLeiteCondensado(new SaborBanana(acaiSimples)));
        System.out.println(acaiCompleto.getDescricao() + " - Custo: R$ " + acaiCompleto.custo());
    }
}

