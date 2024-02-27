package conversor.validações;
import javax.swing.JOptionPane;

public class ValidacaoFinal {
    public static int mostrarCaixaDialogo() {
        return JOptionPane.showConfirmDialog(null, "Deseja fazer outra conversão?", "Conversor de Tempo", JOptionPane.YES_NO_CANCEL_OPTION);
    }

    public static void tratarOpcao(int opcao) {
        if (opcao == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa finalizado");
        } else if (opcao == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa concluído");
        }
    }
}

