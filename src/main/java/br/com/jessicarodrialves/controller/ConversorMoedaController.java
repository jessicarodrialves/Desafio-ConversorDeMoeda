package br.com.jessicarodrialves.controller;

import br.com.jessicarodrialves.model.ConversorMoeda;
import br.com.jessicarodrialves.model.ConversorMoedaRecord;
import com.google.gson.*;

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

        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

        Double cotacao = conversionRates.get(moedaDestino.toUpperCase()).getAsDouble();

        String cotacaoFormatada = String.format("%.10f",cotacao);
        System.out.println("Cotação obtida:" + cotacaoFormatada);
        Double resultado = cotacao * valorQueSeraConvertido;
        System.out.printf("Valor convertido de %s para %s: %.3f%n", moedaOrigem, moedaDestino, resultado);

        return conversorMoeda.converterMoeda(cotacao);
    }


}
