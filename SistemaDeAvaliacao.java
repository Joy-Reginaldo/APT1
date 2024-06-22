import javax.swing.JOptionPane;
public class SistemaDeAvaliacao {
public static void main(String[] args) {
      
  String prova1Str = JOptionPane.showInputDialog("Digite a nota da primeira nota:");
  double prova1 = Double.parseDouble(prova1Str);

  String prova2Str = JOptionPane.showInputDialog("Digite a nota da segunda nota:");
  double prova2 = Double.parseDouble(prova2Str);

  String trabalhoStr = JOptionPane.showInputDialog("Nota do trabalho:");
  double trabalho = Double.parseDouble(trabalhoStr);

  double media = (prova1 + prova2 + trabalho) / 3.0;
  String mensagem;
    if (media >= 6.0) {
     mensagem = String.format("Média: %.2f. APROVADO!", media);
   } else {
     mensagem = String.format("Média: %.2f. REPROVADO!", media);
   }
    JOptionPane.showMessageDialog(null, mensagem);
    }
}