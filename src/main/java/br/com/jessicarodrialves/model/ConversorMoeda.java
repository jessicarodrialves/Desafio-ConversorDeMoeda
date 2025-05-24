package br.com.jessicarodrialves.model;

public class ConversorMoeda {
    private String moedaOrigem;
    private String moedaDestino;
    private Double valorQueSeraConvertido;

    public ConversorMoeda(String moedaOrigem, String moedaDestino, Double valorQueSeraConvertido) {
        this.moedaOrigem = moedaOrigem;
        this.moedaDestino = moedaDestino;
        this.valorQueSeraConvertido = valorQueSeraConvertido;
    }

    public String getMoedaOrigem() {
        return moedaOrigem;
    }

    public String getMoedaDestino() {
        return moedaDestino;
    }

    public Double getValorQueSeraConvertido() {
        return valorQueSeraConvertido;
    }

    @Override
    public String toString() {
        return "Conversão: " + moedaOrigem + " => " + moedaDestino +
                ", valor convertido: " + valorQueSeraConvertido;
    }

    public Double converterMoeda(Double cotacao){
        Double valorConvertido = 0.0;
        //fazer a logica da conversao
        return valorConvertido;
    }
}
