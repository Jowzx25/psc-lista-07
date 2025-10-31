import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CalculadoraSalarios {

    // Constantes do problema
    final static double SALARIO_BASE = 200.0;
    final static double TAXA_COMISSAO = 0.09; // 9%

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array de Contadores:
        // O tamanho 9 corresponde aos 9 intervalos de salário:
        // [0]: $200 - $299
        // [1]: $300 - $399
        // ...
        // [7]: $900 - $999
        // [8]: $1000 em diante
        int[] contadoresIntervalos = new int[9];
        
        // Lista para armazenar as vendas brutas de cada vendedor (entrada indeterminada)
        List<Double> vendasBrutas = new ArrayList<>();
        
        System.out.println("💰 Distribuição Salarial de Vendedores 💰");
        System.out.println("Digite o valor das vendas brutas (ou -1 para finalizar):");

        // 1. Loop de Leitura das Vendas Brutas (Entrada Indeterminada)
        while (true) {
            System.out.print("Vendas Brutas do Vendedor: R$ ");
            if (!scanner.hasNextDouble