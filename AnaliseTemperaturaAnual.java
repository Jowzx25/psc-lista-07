import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AnaliseTemperaturaAnual {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lista para armazenar as temperaturas médias de cada mês
        List<Double> temperaturas = new ArrayList<>();
        
        // Array com os nomes dos meses para exibição
        String[] meses = {
            "1 - Janeiro", "2 - Fevereiro", "3 - Março", "4 - Abril",
            "5 - Maio", "6 - Junho", "7 - Julho", "8 - Agosto",
            "9 - Setembro", "10 - Outubro", "11 - Novembro", "12 - Dezembro"
        };
        
        double somaTemperaturas = 0;

        System.out.println("🚀 Análise de Temperatura Média Anual 🚀");
        System.out.println("Por favor, digite a temperatura média de cada mês:");

        // 1. Leitura e Armazenamento das Temperaturas
        for (int i = 0; i < meses.length; i++) {
            System.out.printf("Temperatura de %s (°C): ", meses[i]);
            double temp = scanner.nextDouble();
            temperaturas.add(temp);
            somaTemperaturas += temp; // Acumula a soma para o cálculo da média
        }

        scanner.close();

        // 2. Cálculo da Média Anual
        double mediaAnual = somaTemperaturas / meses.length;

        // --- Saída de Dados ---
        
        System.out.println("\n================