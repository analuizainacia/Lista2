import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos dados de entrada
        System.out.print("Digite o total de veículos no estacionamento: ");
        int totalVeiculos = scanner.nextInt();
        
        System.out.print("Digite o total de rodas no estacionamento: ");
        int totalRodas = scanner.nextInt();
        
        // Cálculo do número de carros e motos
        int carros = (totalRodas - (2 * totalVeiculos)) / 2;
        int motos = totalVeiculos - carros;
        
        // Verificação se os valores são válidos
        if (carros >= 0 && motos >= 0 && (4 * carros + 2 * motos) == totalRodas) {
            System.out.println("\n--- Resultado ---");
            System.out.println("Carros no estacionamento: " + carros);
            System.out.println("Motos no estacionamento: " + motos);
        } else {
            System.out.println("Os valores informados não correspondem a uma combinação válida de carros e motos.");
        }
        
        scanner.close();
    }
}