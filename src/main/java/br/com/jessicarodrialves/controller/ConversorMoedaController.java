package br.com.jessicarodrialves.controller;

import br.com.jessicarodrialves.model.ConversorMoeda;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMoedaController {


    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            //o setPrettyPrinting realiza a formatação das informações para JSON
            .setPrettyPrinting()
            .create();


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

        Double cotacao = 0.0;

        //Pegar do json a cotação 

        
        return conversorMoeda.converterMoeda(cotacao);
    }
}
