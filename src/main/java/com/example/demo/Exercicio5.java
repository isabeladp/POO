package com.example.demo;
import java.util.Scanner;
public class Exercicio5 {
    

    public static void resolucao() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do terreno em m²: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite o comprimento do terreno em m²: ");
        double comprimento = scanner.nextDouble();

        
        System.out.print("Digite o valor do terreno por m²: ");
        double valorPorMetro = scanner.nextDouble();

        double area = largura * comprimento;

        double valorTotal = area * valorPorMetro;

        System.out.printf("A área do terreno é de %.2f m².%n", area);
        System.out.printf("O valor total do terreno é de R$ %.2f.%n", valorTotal);
        scanner.close();
    }
}

