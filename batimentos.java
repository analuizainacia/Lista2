import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entrada do teclado
        Scanner scanner = new Scanner(System.in);
        
        // Declaração da variável para armazenar a temperatura em Fahrenheit
        double fahrenheit;
        
        // Solicita e lê a temperatura em Fahrenheit
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        
        // Converte para Celsius usando a fórmula: C = (F - 32) / 1.8
        double celsius = (fahrenheit - 32) / 1.8;
        
        // Exibe o resultado formatado com 2 casas decimais
        System.out.printf("%.2f°F equivalem a %.2f°C", fahrenheit, celsius);
        
        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}