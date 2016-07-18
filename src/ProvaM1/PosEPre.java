
package ProvaM1;
public class PosEPre {
    public static void main(String[] args) {
        int a=2, b=-5, c=0, d=-43;
        
        int e = a - --b + d++ - c--;
        e *= --d + --c + e + ++b - d;
        int f = (--b*2) + (2*d) - e++;
        f = b++ + --b + (++d + a);
        
        System.out.println(""+a);
        System.out.println(""+b);
        System.out.println(""+c);
        System.out.println(""+d);
        System.out.println(""+e);
        System.out.println(""+f);
    }
}
