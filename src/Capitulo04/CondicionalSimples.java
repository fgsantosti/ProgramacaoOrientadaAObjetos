package Capitulo04;
import java.util.Scanner;
/**
 * @author fgsantos
 */
public class CondicionalSimples {
    public static void main(String[] args) {
        double vSalto = 0;//valor salto
        Scanner dado;
        dado = new Scanner(System.in);
        System.out.println("Digite seu salto: ");
        vSalto = dado.nextDouble();
   
        if(vSalto > 14.75)
            System.out.println("Você foi melhor que João.");
        else
            System.out.println("Vou não foi melhor que o João");
    }
}
