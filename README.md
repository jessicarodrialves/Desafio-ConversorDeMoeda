# 💱 Conversor de Moedas em Java

Neste emocionante desafio de programação, você terá a oportunidade de explorar APIs, manipular dados JSON e aplicar conceitos de orientação a objetos em Java. Este projeto implementa um **Conversor de Moedas com interação via console**, utilizando taxas de câmbio atualizadas em tempo real.

## 🎯 Objetivo

Desenvolver um sistema de conversão de moedas que:

- Faça **requisições a uma API de câmbio** para obter taxas atualizadas.
- **Interaja com o usuário via console**, permitindo escolher entre diferentes conversões.
- Ofereça pelo menos **6 opções distintas de conversão de moedas**.
- Utilize conceitos de **JSON parsing**, **HTTP requests**, e **orientação a objetos** em Java.

## 🚀 Tecnologias Utilizadas

- **Java 17+**
- **Gson** (para manipulação de JSON)
- **HttpClient** (para requisições à API)
- **API de câmbio:** [ExchangeRate-API](https://www.exchangerate-api.com/)


## 🔄 Como Funciona

1. O usuário escolhe duas moedas (origem e destino) e um valor para conversão.
2. O sistema faz uma requisição à API ExchangeRate para obter a cotação atual.
3. O valor convertido é exibido no console.
4. O menu oferece **várias opções de conversão** como: USD → BRL, EUR → USD, etc.


