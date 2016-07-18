package Capitulo04;

import java.util.Scanner;

public class Q6Prova {
    public static void main(String[] args) {
        int a,b,c;
        
        Scanner leia;
        leia = new Scanner(System.in);
        System.out.println("A-");
        a=leia.nextInt();
        System.out.println("B-");
        b=leia.nextInt();
        System.out.println("C-");
        c=leia.nextInt();
        
        if(a>b && b>c)
            System.out.println(c+"-"+b+"-"+a);
        else if(a>c && c>b)
            System.out.println(b+"-"+c+"-"+a);
        
        if(b>a && a>c)
            System.out.println(c+"-"+a+"-"+b);
        else if(b>c && c>a)
            System.out.println(a+"-"+c+"-"+b);
        
        if(c>a && a>b)
            System.out.println(b+"-"+a+"-"+c);
        else if(c>b && b>a)
            System.out.println(a+"-"+b+"-"+c);
        
    }
            
}
