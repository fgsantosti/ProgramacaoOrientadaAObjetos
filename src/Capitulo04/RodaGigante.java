
package Capitulo04;

import java.util.Scanner;

/**
 *
 * @author fgsantos
 */
public class RodaGigante {
    //Idade de ir para Roda Gigante DF   
    public static void main(String[] args) {
        int idade;
        Scanner dado;
        dado = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = dado.nextInt();
        //Verificar se com sua idade é permitido ou não.
        if(idade >= 16)
            System.out.println("Você pode entrar.");
        else
            System.out.println("Você não pode entrar");
    }
}
