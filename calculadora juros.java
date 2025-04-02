import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculadoraJurosCompostos {
    public static void main(String[] args) {
        // Configuração do Scanner para entrada de dados e DecimalFormat para saída
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        // Leitura dos dados de entrada
        System.out.print("Digite o valor do capital a ser aplicado (R$): ");
        double capital = scanner.nextDouble();
        
        System.out.print("Digite o prazo de aplicação (meses): ");
        int meses = scanner.nextInt();
        
        System.out.print("Digite a taxa de juros mensal (%): ");
        double taxaJuros = scanner.nextDouble() / 100; // Converte porcentagem para decimal
        
        // Cálculo do montante usando a fórmula M = C × (1 + i)^n
        double montante = capital * Math.pow(1 + taxaJuros, meses);
        
        // Exibição dos resultados
        System.out.println("\nResultado da aplicação:");
        System.out.println("Capital inicial: R$ " + df.format(capital));
        System.out.println("Prazo: " + meses + " meses");
        System.out.println("Taxa de juros mensal: " + (taxaJuros * 100) + "%");
        System.out.println("Montante final: R$ " + df.format(montante));
        
        scanner.close();
    }
}