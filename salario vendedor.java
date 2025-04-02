import java.util.Scanner;

public class CalculoSalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos dados de entrada
        System.out.print("Digite o salário fixo do vendedor: R$ ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.print("Digite o valor total das vendas no mês: R$ ");
        double totalVendas = scanner.nextDouble();
        
        System.out.print("Digite o percentual de comissão sobre vendas (%): ");
        double percentualComissao = scanner.nextDouble();
        
        // Cálculo da comissão e salário total
        double comissao = totalVendas * (percentualComissao / 100);
        double salarioTotal = salarioFixo + comissao;
        
        // Exibição dos resultados
        System.out.println("\n--- Demonstrativo de Pagamento ---");
        System.out.printf("Salário fixo: R$ %.2f\n", salarioFixo);
        System.out.printf("Total de vendas: R$ %.2f\n", totalVendas);
        System.out.printf("Comissão (%.2f%% sobre vendas): R$ %.2f\n", percentualComissao, comissao);
        System.out.printf("SALÁRIO TOTAL: R$ %.2f\n", salarioTotal);
        
        scanner.close();
    }
}