package br.com.jessicarodrialves.principal;

import br.com.jessicarodrialves.controller.ConversorMoedaController;
import br.com.jessicarodrialves.model.ConversorMoeda;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner recebeDados = new Scanner(System.in);

        ConversorMoedaController conversorMoedaController = new ConversorMoedaController();

        Double valorQueSeraConvertido = 0.0 ;
        String moedaOrigem = "";
        String moedaDestino = "";

        boolean validaLoop = false;

        System.out.println("Seja bem vindo ao Conversor de Moeda!!!! ");

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

            if(opcao != 7){
                System.out.println(" Informe o valor a ser convertido:  ");
                valorQueSeraConvertido = recebeDados.nextDouble();
            }



        switch (opcao) {
            case 1:
                moedaOrigem = "USD";
                moedaDestino = "ARS";

                validaLoop = true;
                break;
            case 2:
                System.out.println(" Informe o valor a ser convertido:  ");
                valorQueSeraConvertido = recebeDados.nextDouble();
                System.out.println("2 - Peso Argentino => Dólar");
                validaLoop = true;
                break;
            case 3:
                System.out.println(" Informe o valor a ser convertido:  ");
                valorQueSeraConvertido = recebeDados.nextDouble();
                System.out.println("3 - Dólar => Real Brasileiro");
                validaLoop = true;
                break;
            case 4:
                System.out.println(" Informe o valor a ser convertido:  ");
                valorQueSeraConvertido = recebeDados.nextDouble();
                System.out.println("4 - Real Brasileiro => Dólar");
                validaLoop = true;
                break;
            case 5:
                System.out.println(" Informe o valor a ser convertido:  ");
                valorQueSeraConvertido = recebeDados.nextDouble();
                System.out.println("5 - Dólar => Peso Colombiano");
                validaLoop = true;
                break;
            case 6:
                System.out.println(" Informe o valor a ser convertido:  ");
                valorQueSeraConvertido = recebeDados.nextDouble();
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

            conversorMoedaController.converterValor(moedaOrigem,moedaDestino,valorQueSeraConvertido);


        } while (validaLoop);
    }
}