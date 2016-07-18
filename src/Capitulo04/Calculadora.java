package Capitulo04;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int num1, num2;
        int op;
        
        Scanner dado;
        dado = new Scanner(System.in);
        
        System.out.println("Digite o numero 1: ");
        num1 = dado.nextInt();
        
        System.out.println("Digite a operacao desejada:");
        System.out.println("1 - Para somar");
        System.out.println("2 - Para subtrair");
        System.out.println("3 - Para multiplicar");
        System.out.println("4 - Para dividir");
        op = dado.nextInt();
        
        System.out.println("Digite o numero 2: ");
        num2 = dado.nextInt();
        
        double soma, mul, sub, div;
        switch(op){
            case 1: 
                soma = num1+num2;
                System.out.println("Soma igual:  "+soma);
                break;
            case 2: 
                sub = num1-num2;
                System.out.println("Subtração igual:  "+sub);
                break;
            case 3: 
                mul = num1*num2;
                System.out.println("Multiplicação igual: "+mul);
                break;
            case 4: 
                div = num1/num2;
                System.out.println("Divisão igual: "+div);
                break;
            default:
                System.out.println("Você não digitou nenhuma operação.");
        }
        
    }
}
