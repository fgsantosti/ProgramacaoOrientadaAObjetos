/*
Faça um programa que receba três notas, calcule e 
mostre a média aritmética entre elas.
 */
package ProvaM1;

/**
 *
 * @author fgsantos
 */
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media =0;
        
        Scanner dado;
        dado = new Scanner(System.in);
        
        System.out.println("Digite sua primeira nota :");
        nota1 = dado.nextDouble();
        
        System.out.println("Digite sua segunda nota :");
        nota2 = dado.nextDouble();
        
        System.out.println("Digite sua terceira nota :");
        nota3 = dado.nextDouble();
        
        media = (nota1+nota2+nota3)/3;
        
        System.out.println("Sua média foi: "+media);
        
    }
}
