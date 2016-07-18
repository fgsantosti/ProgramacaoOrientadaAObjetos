package Capitulo04;

/**
 * @author fgsantos
 */
public class SinaldeTransito {
    public static void main(String[] args) {
        boolean sinal=false;
        
        if(sinal){
            System.out.println("Sinal esta verde.");
            System.out.println("Prossiga.");
        }else if(sinal ==false){
            System.out.println("Sinal esta vermenlho.");
            System.out.println("Pare o veículo.");
        }else{
            System.out.println("Sinal amarelo");
            System.out.println("Atenção");
        }       
    }
    
}
