import java.util.Scanner;

public class ConversorTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura do valor em segundos
        System.out.print("Digite a quantidade de segundos: ");
        int totalSegundos = scanner.nextInt();
        
        // Cálculo das horas, minutos e segundos
        int horas = totalSegundos / 3600;          // 1 hora = 3600 segundos
        int resto = totalSegundos % 3600;          // Resto após extrair as horas
        int minutos = resto / 60;                  // 1 minuto = 60 segundos
        int segundos = resto % 60;                 // Segundos restantes
        
        // Exibição do resultado formatado
        System.out.printf("\n%d segundos equivalem a:\n", totalSegundos);
        System.out.printf("%d hora(s), %d minuto(s) e %d segundo(s)", horas, minutos, segundos);
        
        scanner.close();
    }
}