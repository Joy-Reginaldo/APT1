import javax.swing.JOptionPane;

public class CalculadoraITBI {
    
    public static void main(String[] args) {
        // Entrada de dados usando JOptionPane
        String valorTransacaoStr = JOptionPane.showInputDialog(null, "Digite o valor de transação do imóvel:", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);
        String valorVenalStr = JOptionPane.showInputDialog(null, "Digite o valor venal do imóvel:", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);
        String percentualITBIStr = JOptionPane.showInputDialog(null, "Digite a porcentagem do ITBI:", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);
        
        // Conversão dos valores de String para double
        double valorTransacao = Double.parseDouble(valorTransacaoStr);
        double valorVenal = Double.parseDouble(valorVenalStr);
        double percentualITBI = Double.parseDouble(percentualITBIStr);

        // Calculando o maior valor entre o valor de transação e o valor venal
        double maiorValor = Math.max(valorTransacao, valorVenal);

        // Calculando o valor do ITBI
        double valorITBI = (percentualITBI / 100) * maiorValor;

        // Exibindo o resultado
        String mensagem = String.format("O valor do ITBI a ser pago é: R$ %.2f", valorITBI);
        JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}