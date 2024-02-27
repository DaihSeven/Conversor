package conversor.controller;
import conversor.validações.ValidacaoEntrada;
import conversor.validações.ValidacaoFinal;

import javax.swing.JOptionPane;

public class ConversorTempo {
    private ValidacaoEntrada validacaoEntrada = new ValidacaoEntrada();

    void converter() {
        int opcao;
        do {

            String[] unidades = {"Horas para minutos", "Horas para segundos", "Horas para anos", "Horas para dias", "Minutos para segundos", "Minutos para horas", "Minutos para dias", "Minutos para anos",
                    "Segundos para minutos", "Segundos para horas", "Segundos para dias", "Segundos para anos", "Anos para horas", "Anos para minutos", "Anos para segundos", "Dias para anos", "Dias para horas", "Dias para minutos", "Dias para segundos"};
            String unidadeOrigem = (String) JOptionPane.showInputDialog(null, "Escolha a unidade de tempo de origem:", "Conversor de Tempo", JOptionPane.QUESTION_MESSAGE, null, unidades, unidades[0]);
            String valorTempoOrigem = String.valueOf(validacaoEntrada.obterNumero("Digite o valor em " + unidadeOrigem + ":"));
            double valorTempoDestino = 0;

            switch (unidadeOrigem) {
                case "Horas para minutos":
                    valorTempoDestino = Double.parseDouble(valorTempoOrigem) * 60;
                    break;
                case "Horas para segundos":
                    valorTempoDestino = Double.parseDouble(valorTempoOrigem) * 3600;
                    break;
                case "Horas para anos":
                    valorTempoDestino = Double.parseDouble(valorTempoOrigem) / 8760;
                    break;
                case "Horas para dias":
                    valorTempoDestino = Double.parseDouble(valorTempoOrigem) / 24;
                    break;
                case "Minutos para segundos":
                    valorTempoDestino = Double.parseDouble(valorTempoOrigem) * 60;
                    break;
                case "Minutos para horas":
                    valorTempoDestino = Double.parseDouble(valorTempoOrigem) / 60;
                    break;
                case "Minutos para dias":
                    valorTempoDestino = Double.parseDouble(valorTempoOrigem) / 1440;
                    break;
                case "Minutos para anos":
                    valorTempoDestino = Double.parseDouble(valorTempoOrigem) / 525600;
                    break;
                case "Segundos para minutos":
                    valorTempoDestino = Double.parseDouble(valorTempoOrigem) / 60;
                    break;
                case "Segundos para horas":
                    valorTempoDestino = Double.parseDouble(valorTempoOrigem) / 3600;
                    break;
                case "Segundos para dias":
                    valorTempoDestino = Double.parseDouble(valorTempoOrigem) / 86400;
                    break;
                case "Segundos para anos":
                    valorTempoDestino = Double.parseDouble(valorTempoOrigem) / 31536000;
                    break;
                case "Anos para horas":
                    valorTempoDestino = Double.parseDouble(valorTempoOrigem) * 8760;
                    break;
                case "Anos para minutos":
                    valorTempoDestino = Double.parseDouble(valorTempoOrigem) * 525600;
                    break;
                case "Anos para segundos":
                    valorTempoDestino = Double.parseDouble(valorTempoOrigem) * 31536000;
                    break;
                case "Dias para anos":
                    valorTempoDestino = Double.parseDouble(valorTempoOrigem) / 365;
                    break;
                case "Dias para horas":
                    valorTempoDestino = Double.parseDouble(valorTempoOrigem) * 24;
                    break;
                case "Dias para minutos":
                    valorTempoDestino = Double.parseDouble(valorTempoOrigem) * 1440;
                    break;
                case "Dias para segundos":
                    valorTempoDestino = Double.parseDouble(valorTempoOrigem) * 86400;
                    break;
            }

            JOptionPane.showMessageDialog(null, "O valor convertido é: " + valorTempoDestino);

            opcao = ValidacaoFinal.mostrarCaixaDialogo();
            ValidacaoFinal.tratarOpcao(opcao);
        } while (opcao == JOptionPane.YES_OPTION);
    }
}


