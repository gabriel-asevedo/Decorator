package application;

import entities.*;
import service.Adicional;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tamanho do Açaí:");
        System.out.println("1. Pequeno");
        System.out.println("2. Médio");
        System.out.println("3. Grande");
        int tamanhoEscolha = scanner.nextInt();
        Tamanho tamanho = escolherTamanho(tamanhoEscolha);

        Adicional pedido = new Acai(tamanho);

        pedido = adicionarAdicional(pedido, scanner, "Morango");
        pedido = adicionarAdicional(pedido, scanner, "Banana");
        pedido = adicionarAdicional(pedido, scanner, "Leite Condensado");

        System.out.println("\nResumo do pedido:");
        System.out.println(pedido.getDescricao() + " - Custo: R$ " + pedido.custo());

        scanner.close();
    }

    private static Tamanho escolherTamanho(int escolha) {
        return switch (escolha) {
            case 1 -> Tamanho.PEQUENO;
            case 2 -> Tamanho.MEDIO;
            case 3 -> Tamanho.GRANDE;
            default -> {
                System.out.println("Tamanho inválido! O tamanho será definido como PEQUENO.");
                yield Tamanho.PEQUENO;
            }
        };
    }

    private static Adicional adicionarAdicional(Adicional pedido, Scanner scanner, String adicionalNome) {
        System.out.println("Deseja adicionar " + adicionalNome + "? (s/n)");
        char resposta = scanner.next().toLowerCase().charAt(0);

        if (resposta == 's') {
            switch (adicionalNome) {
                case "Morango":
                    return new SaborMorango(pedido);
                case "Banana":
                    return new SaborBanana(pedido);
                case "Leite Condensado":
                    return new SaborLeiteCondensado(pedido);
                default:
                    return pedido;
            }
        }
        return pedido; 
    }
}