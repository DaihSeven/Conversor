package conversor.validações;
import javax.swing.*;

public class ValidacaoEntrada {
    public double obterNumero(String mensagem) {
        while (true) {
            String input = JOptionPane.showInputDialog(null, mensagem);
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido. Por favor, digite um número.");
            }
        }
    }
}
