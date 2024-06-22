public class CircuitoResistencias {
    private double[] resistencias;

    // Construtor que recebe os valores das resistências
    public CircuitoResistencias(double r1, double r2, double r3, double r4) {
        resistencias = new double[4];
        resistencias[0] = r1;
        resistencias[1] = r2;
        resistencias[2] = r3;
        resistencias[3] = r4;
    }

    // Método para calcular a resistência equivalente (soma das resistências)
    public double calcularResistenciaEquivalente() {
        double soma = 0;
        for (double r : resistencias) {
            soma += r;
        }
        return soma;
    }

    // Método para obter a maior resistência
    public double obterMaiorResistencia() {
        double maior = resistencias[0];
        for (double r : resistencias) {
            if (r > maior) {
                maior = r;
            }
        }
        return maior;
    }

    // Método para obter a menor resistência
    public double obterMenorResistencia() {
        double menor = resistencias[0];
        for (double r : resistencias) {
            if (r < menor) {
                menor = r;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe
        CircuitoResistencias circuito = new CircuitoResistencias(10.0, 15.0, 20.0, 25.0);

        double resistenciaEquivalente = circuito.calcularResistenciaEquivalente();
        double maiorResistencia = circuito.obterMaiorResistencia();
        double menorResistencia = circuito.obterMenorResistencia();

        System.out.println("Resistência Equivalente: " + resistenciaEquivalente);
        System.out.println("Maior Resistência: " + maiorResistencia);
        System.out.println("Menor Resistência: " + menorResistencia);
    }
}