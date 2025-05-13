package br.com.jessicarodrialves.controller;

import br.com.jessicarodrialves.model.ConversorMoeda;
import br.com.jessicarodrialves.model.ConversorMoedaRecord;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMoedaController {

    public Double converterValor(String moedaOrigem, String moedaDestino, Double valorQueSeraConvertido) throws IOException, InterruptedException {
        ConversorMoeda conversorMoeda = new ConversorMoeda(moedaOrigem,moedaDestino,valorQueSeraConvertido);

        String endereco = "https://v6.exchangerate-api.com/v6/1f6bc4a690e8a4e8b438d625/latest/"+moedaOrigem;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        Gson gson = new Gson();
        ConversorMoedaRecord cotacaoRecord = gson.fromJson(json, ConversorMoedaRecord.class);

        Double cotacao = cotacaoRecord.conversion_rates().get(moedaDestino.toUpperCase());
        String cotacaoFormatada = String.format("%.10f",cotacao);
        System.out.println("Cotação obtida:" + cotacaoFormatada);
        Double resultado = cotacao * valorQueSeraConvertido;
        System.out.printf("Valor convertido de %s para %s: %.3f%n", moedaOrigem, moedaDestino, resultado);

        return conversorMoeda.converterMoeda(cotacao);
    }


}
