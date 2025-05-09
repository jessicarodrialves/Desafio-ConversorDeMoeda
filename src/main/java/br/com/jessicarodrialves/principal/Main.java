package br.com.jessicarodrialves.principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean validaLoop = false;
        System.out.println("Seja bem vindo ao Conversor de Moeda!!!! ");

        Scanner recebeDados = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("--------------------------------------------");
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Dólar => Peso Argentino");
            System.out.println("2 - Peso Argentino => Dólar");
            System.out.println("3 - Dólar => Real Brasileiro");
            System.out.println("4 - Real Brasileiro => Dólar");
            System.out.println("5 - Dólar => Peso Colombiano");
            System.out.println("6 - Peso Colombiano => Dólar");
            System.out.println("7 - Sair");

            opcao = recebeDados.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("1 - Dólar => Peso Argentino");
                validaLoop = true;
                break;
            case 2:
                System.out.println("2 - Peso Argentino => Dólar");
                validaLoop = true;
                break;
            case 3:
                System.out.println("3 - Dólar => Real Brasileiro");
                validaLoop = true;
                break;
            case 4:
                System.out.println("4 - Real Brasileiro => Dólar");
                validaLoop = true;
                break;
            case 5:
                System.out.println("5 - Dólar => Peso Colombiano");
                validaLoop = true;
                break;
            case 6:
                System.out.println("6 - Peso Colombiano => Dólar");
                validaLoop = true;
                break;
            case 7:
                System.out.println("Encerrando...");
                validaLoop = false;
                break;
            default:
                System.out.println("Opção inválida!! Informe número de 1 a 6");
                validaLoop = true;
                break;
            }
        } while (validaLoop);
    }
}