import java.util.Scanner;

public class CalculoSalarioBruto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos dados de entrada
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();
        
        System.out.print("Digite o valor recebido por hora de trabalho: R$ ");
        double valorHora = scanner.nextDouble();
        
        System.out.print("Digite o valor do salário família por filho: R$ ");
        double salarioFamilia = scanner.nextDouble();
        
        System.out.print("Digite o número de filhos com menos de 14 anos: ");
        int numeroFilhos = scanner.nextInt();
        
        // Cálculos
        double salarioBase = horasTrabalhadas * valorHora;
        double totalSalarioFamilia = salarioFamilia * numeroFilhos;
        double salarioBruto = salarioBase + totalSalarioFamilia;
        
        // Exibição dos resultados
        System.out.println("\n--- Demonstrativo de Salário Bruto ---");
        System.out.printf("Salário base (%.2f horas × R$ %.2f): R$ %.2f\n", 
                         horasTrabalhadas, valorHora, salarioBase);
        System.out.printf("Salário família (%d filhos × R$ %.2f): R$ %.2f\n", 
                         numeroFilhos, salarioFamilia, totalSalarioFamilia);
        System.out.printf("SALÁRIO BRUTO TOTAL: R$ %.2f\n", salarioBruto);
        
        scanner.close();
    }
}