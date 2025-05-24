package br.com.jessicarodrialves.model;

import java.util.Map;

public record ConversorMoedaRecord(String result, String base_code, Map<String, Double> conversion_rates) {
}
