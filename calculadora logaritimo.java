import java.util.Scanner;
import java.lang.Math;

public class CalculadoraLogaritmo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos números de entrada
        System.out.print("Digite o número (logaritmando): ");
        double numero = scanner.nextDouble();
        
        System.out.print("Digite a base do logaritmo: ");
        double base = scanner.nextDouble();
        
        // Verificação das condições matemáticas
        if (numero <= 0 || base <= 0 || base == 1) {
            System.out.println("Erro: O número deve ser positivo e a base deve ser positiva e diferente de 1");
        } else {
            // Cálculo do logaritmo usando a fórmula de mudança de base: logₐb = ln(b)/ln(a)
            double resultado = Math.log(numero) / Math.log(base);
            
            // Exibição do resultado com 4 casas decimais
            System.out.printf("O logaritmo de %.2f na base %.2f é: %.4f", numero, base, resultado);
        }
        
        scanner.close();
    }
}