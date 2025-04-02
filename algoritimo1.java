 /*Integrantes: Nome do aluno: Leandro Henrique - 323132411
  Nome do aluno: Ana Luíza Inácia - 323116414
  Nome do aluno: Arthur Carvalho - 323126778
  Nome do aluno: Lorena Malta - 323131530
/*/
import java.util.Scanner;

public class MediaAritmetica {
    public static void main1(String[] args) {
        // Cria um objeto Scanner para ler entrada do teclado
        Scanner scanner = new Scanner(System.in);
        
        // Declaração das variáveis para armazenar os números e a média
        double num1, num2, media;
        
        // Solicita e lê o primeiro número
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();
        
        // Solicita e lê o segundo número 
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();
        
        // Calcula a média
        media = (num1 + num2) / 2;
        
        // Exibe o resultado
        System.out.printf("A média aritmética dos números %.2f e %.2f é: %.2f", num1, num2, media);
        
        // Fecha o scanner para liberar recursos
        scanner.close();
 }
} 