import java.util.Scanner;

public class AumentoPreco {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entrada do teclado
        Scanner scanner = new Scanner(System.in);
        
        // Declaração da variável para armazenar o preço do produto
        double precoOriginal;
        
        // Solicita e lê o preço do produto
        System.out.print("Informe o valor do produto: ");
        precoOriginal = scanner.nextDouble();
        
        // Calcula o novo valor com acréscimo de 10%
        double novoPreco = precoOriginal * 1.10;
        
        // Exibe o resultado formatado com 2 casas decimais
        System.out.printf("Novo valor do produto: %.2f", novoPreco);
        
        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}