package Capitulo04;

import java.util.Scanner;

/**
 * @author fgsantos
 */
public class CondicionalCase {

    public static void main(String[] args) {
        int i;
        Scanner dado;
        dado =new Scanner(System.in);
        
        int a, b;
        System.out.println("Digite numero 1: ");
        a = dado.nextInt();
        
        System.out.println("\t Digite a opçao desejada:");
        System.out.println("\t 1-Soma");
        System.out.println("\t 2-Subtracao");
        System.out.println("\t 3-Multiplicacao");
        System.out.println("\t 4-Divisao");
        i =dado.nextInt();
        
        System.out.println("Digite numero 2: ");
        b = dado.nextInt();
        int soma =0, sub=0, mul=0, div=0;
        
        switch (i) {
            case 1:
                soma = a+b;
                System.out.println("Soma: "+soma);
                break;
            case 2:
                sub = a-b;
                System.out.println("Subtracao: "+sub);
                break;
            case 3:
                mul= a*b;
                System.out.println("Multiplicacao: "+mul);
                break;
            case 4:
                div = a/b;
                System.out.println("Divisao: "+div);
                break;
            default:
                System.out.println("Voçê não digitou "
                        + "nenhum opção correta.");
        }
    }
}
