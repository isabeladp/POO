package com.example.demo;
import java.util.Scanner;
public class Exercicio8 {
    
    
    public static void resolucao() {
        Scanner sc = new Scanner(System.in);
    
    double celsius;
    double fahrenheith;
    
    System.out.println("Leia os graus celsius:");
    
    celsius = sc.nextDouble();
     
    fahrenheith = celsius * 1.8 + 32;
    System.out.printf("Fahrenheith:%.2f",fahrenheith);
    sc.close();
    
    
    }
    }

