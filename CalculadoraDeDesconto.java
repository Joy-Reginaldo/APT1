import java.util.Scanner;

public class CalculadoraDeDesconto {

    public static void main(String[] args) {
         Cria uma instância do Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
         Solicita e lê o valor do produto
        System.out.print(Digite o valor do produto );
        double valorProduto = scanner.nextDouble();
        
         Solicita e lê a porcentagem de desconto
        System.out.print(Digite a porcentagem de desconto );
        double porcentagemDesconto = scanner.nextDouble();
        
         Calcula o valor do desconto
        double valorDesconto = calcularDesconto(valorProduto, porcentagemDesconto);
        
         Calcula o preço final do produto após aplicar o desconto
        double precoFinal = valorProduto - valorDesconto;
        
         Exibe o valor do desconto e o preço final do produto
        System.out.printf(Valor do desconto R$%.2f%n, valorDesconto);
        System.out.printf(Preço final do produto R$%.2f%n, precoFinal);
        
         Fecha o Scanner
        scanner.close();
    }
    
    
      Método para calcular o valor do desconto com base no valor do produto e na porcentagem de desconto
     
      @param valorProduto O valor do produto
      @param porcentagemDesconto A porcentagem de desconto
      @return O valor do desconto
     
    public static double calcularDesconto(double valorProduto, double porcentagemDesconto) {
        return valorProduto  (porcentagemDesconto  100);
    }
}