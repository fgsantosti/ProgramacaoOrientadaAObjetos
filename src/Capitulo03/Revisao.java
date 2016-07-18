package Capitulo03;

import java.util.Scanner;

public class Revisao {
    public static void main(String[] args) {
        int num1=0, num2=0, soma =0;
        
        Scanner dado;
        dado = new Scanner(System.in);
        
        System.out.println("Digite o num 1: ");
        num1 = dado.nextInt();
        
        System.out.println("Digite o num 2: ");
        num2 = dado.nextInt();
        
        //Soma dos numeros        
        soma = num1 + num2;
        
        System.out.println("Sua soma é: "+soma);
        
        int elevar = (int) Math.pow(num1,num2);
        
        System.out.println("Num - "+num1+" elevado a "+num2+" é = "+elevar);
        
        
    }
}
