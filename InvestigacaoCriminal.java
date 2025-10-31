import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class InvestigacaoCriminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lista de perguntas a serem feitas
        List<String> perguntas = Arrays.asList(
            "Telefonou para a vítima? (S/N)",
            "Esteve no local do crime? (S/N)",
            "Mora perto da vítima? (S/N)",
            "Devia para a vítima? (S/N)",
            "Já trabalhou com a vítima? (S/N)"
        );
        
        int respostasPositivas = 0; // Contador para respostas "S" (Sim)

        System.out.println("🚨 Questionário de Investigação Criminal 🚨\n");
        System.out.println("Por favor, responda 'S' (Sim) ou 'N' (Não) para cada pergunta.");

        // 1. Loop para fazer as 5 perguntas
        for (String pergunta : perguntas) {
            String resposta = "";
            boolean respostaValida = false;

            // Loop de validação para garantir que o usuário digite S ou N
            while (!respostaValida) {
                System.out.print(pergunta + " ");
                resposta = scanner.next().toUpperCase(); // Lê e converte para maiúsculo
                
                if (resposta.equals("S") || resposta.equals("N")) {
                    respostaValida = true;
                } else {
                    System.out.println("Resposta inválida. Por favor, digite apenas 'S' ou