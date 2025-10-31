import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AnaliseDeNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Lista dinâmica para armazenar um número indeterminado de notas
        List<Double> notas = new ArrayList<>();
        
        // Variável para armazenar cada nota lida
        double notaAtual = 0; 

        System.out.println("🚀 Entrada de Notas (Digite -1 para encerrar) 🚀\n");

        // 2. Loop de Leitura (Indeterminado)
        // O loop 'do-while' garante que o bloco de código execute pelo menos uma vez
        do {
            System.out.print("Digite uma nota (ou -1 para finalizar): ");
            
            // Leitura da nota
            if (scanner.hasNextDouble()) {
                notaAtual = scanner.nextDouble();
            } else {
                // Lidar com entrada inválida (não numérica)
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Limpa o buffer de entrada
                continue; // Volta para o início do loop
            }

            // 3. Condição de Parada
            if (notaAtual == -1)