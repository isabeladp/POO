package com.example.demo.lista2;
import java.util.Scanner;
public class Exercicio5 {

    public static void resolucao2() {
       Scanner sc = new Scanner(System.in);

        String login = "isabela@gmail.com";
        String senha = "isa1998!@";
        String verificaLogin;
        String verificaSenha;

        System.out.println("Entre com seu login: ");
        verificaLogin = sc.nextLine();

        System.out.println("Entre com sua senha: ");
        verificaSenha = sc.nextLine();

        if (!verificaLogin.equals(login)){
            System.out.println("Login incorreto!");
        }else if(!verificaSenha.equals(senha)){
            System.out.println("Senha incorreta!");
        }else {
            System.out.println("Bem vindo ao sistema " + login);
        }


        sc.close();
    }
}

