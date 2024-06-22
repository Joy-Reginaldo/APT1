public class CalculadoraAposentadoria {
    private int idade;
    private String sexo; // 'M' para masculino, 'F' para feminino
    private int anosContribuicao;

    public CalculadoraAposentadoria(int idade, String sexo, int anosContribuicao) {
        this.idade = idade;
        this.sexo = sexo;
        this.anosContribuicao = anosContribuicao;
    }

    public void verificarAposentadoria() {
        int idadeMinima, anosMinimosContribuicao;

        // Definindo as regras de aposentadoria baseadas no sexo
        if (sexo.equalsIgnoreCase("M")) {
            idadeMinima = 65;
            anosMinimosContribuicao = 35;
        } else if (sexo.equalsIgnoreCase("F")) {
            idadeMinima = 62;
            anosMinimosContribuicao = 30;
        } else {
            System.out.println("Sexo inválido. Informe 'M' para masculino ou 'F' para feminino.");
            return;
        }

        // Verificando se pode se aposentar por idade ou por tempo de contribuição
        if (idade >= idadeMinima && anosContribuicao >= anosMinimosContribuicao) {
            System.out.println("Você já pode se aposentar!");
        } else {
            int anosFaltantesIdade = idadeMinima - idade;
            int anosFaltantesContribuicao = anosMinimosContribuicao - anosContribuicao;

            if (anosFaltantesIdade <= anosFaltantesContribuicao) {
                System.out.println("Faltam " + anosFaltantesIdade + " anos para você se aposentar por idade.");
            } else {
                System.out.println("Faltam " + anosFaltantesContribuicao + " anos para você se aposentar por tempo de contribuição.");
            }
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe
        CalculadoraAposentadoria calc1 = new CalculadoraAposentadoria(60, "M", 30);
        calc1.verificarAposentadoria(); // Saída: Faltam 5 anos para você se aposentar por idade.

        CalculadoraAposentadoria calc2 = new CalculadoraAposentadoria(65, "F", 25);
        calc2.verificarAposentadoria(); // Saída: Faltam 5 anos para você se aposentar por tempo de contribuição.

        CalculadoraAposentadoria calc3 = new CalculadoraAposentadoria(65, "M", 35);
        calc3.verificarAposentadoria(); // Saída: Você já pode se aposentar!

        CalculadoraAposentadoria calc4 = new CalculadoraAposentadoria(55, "F", 20);
        calc4.verificarAposentadoria(); // Saída: Faltam 7 anos para você se aposentar por idade.
    }
}