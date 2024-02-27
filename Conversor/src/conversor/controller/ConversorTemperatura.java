package conversor.controller;
import conversor.validações.ValidacaoEntrada;
import conversor.validações.ValidacaoFinal;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
    private ValidacaoEntrada validacaoEntrada = new ValidacaoEntrada();

    void converter() {
        int opcao = 0;
        do {
            String[] temperaturas = {"Celsius", "Fahrenheit", "Kelvin"};
            String temperaturaOrigem = (String) JOptionPane.showInputDialog(null, "Escolha a temperatura de origem:", "Conversor de Temperatura", JOptionPane.QUESTION_MESSAGE, null, temperaturas, temperaturas[0]);
            String temperaturaDestino = (String) JOptionPane.showInputDialog(null, "Escolha a temperatura de destino:", "Conversor de Temperatura", JOptionPane.QUESTION_MESSAGE, null, temperaturas, temperaturas[0]);

            String valorTemperaturaOrigem = String.valueOf(validacaoEntrada.obterNumero("Digite o valor em " + temperaturaOrigem + ":"));

            double valorTemperaturaDestino = 0;

            try {
                switch (temperaturaOrigem) {
                    case "Celsius":
                        valorTemperaturaDestino = convertFromCelsius(temperaturaDestino, Double.parseDouble(valorTemperaturaOrigem));
                        break;
                    case "Fahrenheit":
                        valorTemperaturaDestino = convertFromFahrenheit(temperaturaDestino, Double.parseDouble(valorTemperaturaOrigem));
                        break;
                    case "Kelvin":
                        valorTemperaturaDestino = convertFromKelvin(temperaturaDestino, Double.parseDouble(valorTemperaturaOrigem));
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
                continue;
            }

            JOptionPane.showMessageDialog(null, "O valor em " + temperaturaDestino + " é: " + valorTemperaturaDestino);

            opcao = ValidacaoFinal.mostrarCaixaDialogo();
            ValidacaoFinal.tratarOpcao(opcao);
        } while (opcao == JOptionPane.YES_OPTION);
    }

    double convertFromCelsius(String to, double value) {
        switch (to) {
            case "Fahrenheit":
                return value * 9/5 + 32;
            case "Kelvin":
                return value + 273.15;
            default:
                return value;
        }
    }

    double convertFromFahrenheit(String to, double value) {
        switch (to) {
            case "Celsius":
                return (value - 32) * 5/9;
            case "Kelvin":
                return (value - 32) * 5/9 + 273.15;
            default:
                return value;
        }
    }

    double convertFromKelvin(String to, double value){
        switch (to) {
            case "Celsius":
                return value - 273.15;
            case "Fahrenheit":
                return (value - 273.15) * 9 / 5 + 32;
            default:
                return value;
        }
    }
}
