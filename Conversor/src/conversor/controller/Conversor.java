package conversor.controller;
import javax.swing.*;

public class Conversor {

    private ConversorMoedas conversorMoedas;
    private ConversorTemperatura conversorTemperatura;
    private ConversorTempo conversorTempo;

    public Conversor() {
        this.conversorMoedas = new ConversorMoedas();
        this.conversorTemperatura = new ConversorTemperatura();
        this.conversorTempo = new ConversorTempo();
    }

    public void obterDadosEntrada() {
        int respostaTipoDeConversao = 0;
        String retornoParaOUsuario = "Insira um número";
        boolean verificaçãoFinal = true;

        String[] opcoes = {"Moedas", "Temperatura", "Tempo"};
        String escolha = (String) JOptionPane.showInputDialog(null,
                "Escolha uma opção de conversão:",
                "Conversor",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        switch (escolha) {
            case "Moedas":
                conversorMoedas.converter();
                break;
            case "Temperatura":
                conversorTemperatura.converter();
                break;
            case "Tempo":
                conversorTempo.converter();
                break;
            default:
                break;
        }
    }
}
