package conversor.controller;
import conversor.validações.ValidacaoEntrada;
import conversor.validações.ValidacaoFinal;

import javax.swing.JOptionPane;

// Classe para conversão de moedas
public class ConversorMoedas {

        private ValidacaoEntrada validacaoEntrada = new ValidacaoEntrada();

        public void converter() {
                int opcao;
                do {
                String[] moedas = {"Real (R$)", "Peso Argentino ($)", "Dólar Americano (US$)", "Euro (€)", "Libra Esterlina (£)", "Iene (¥)", "Dólar Australiano (AU$)", "Franco Suíço (CHF)", "Dólar Canadense (CA$)", "Renminbi (¥)", "Lira Turca (₺)"};
                double[] taxasConversao = {1.0, 0.053, 0.19, 0.17, 0.14, 20.62, 0.27, 0.18, 0.24, 1.22, 1.53}; // Substitua por taxas de conversão reais

                String moedaOrigem = (String) JOptionPane.showInputDialog(null, "Escolha a moeda de origem:", "Conversor de Moedas", JOptionPane.QUESTION_MESSAGE, null, moedas, moedas[0]);
                String moedaDestino = (String) JOptionPane.showInputDialog(null, "Escolha a moeda de destino:", "Conversor de Moedas", JOptionPane.QUESTION_MESSAGE, null, moedas, moedas[0]);

                int indiceOrigem = java.util.Arrays.asList(moedas).indexOf(moedaOrigem);
                int indiceDestino = java.util.Arrays.asList(moedas).indexOf(moedaDestino);

                double valorEmMoedaOrigem = validacaoEntrada.obterNumero("Digite o valor em " + moedaOrigem + ":");
                double valorEmMoedaDestino = valorEmMoedaOrigem * taxasConversao[indiceDestino] / taxasConversao[indiceOrigem];

                JOptionPane.showMessageDialog(null, "O valor em " + moedaDestino + " é: " + valorEmMoedaDestino);

                        opcao = ValidacaoFinal.mostrarCaixaDialogo();
                        ValidacaoFinal.tratarOpcao(opcao);
                } while (opcao == JOptionPane.YES_OPTION);

                }
}
