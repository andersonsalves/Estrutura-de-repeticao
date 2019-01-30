package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public class Main {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        int x = 0;
        
        //Estrutura do-while
        
        do {
            
            if((x % 2) == 0) {                
                System.out.println("Números Pares: " + x);
            }
            
            x++;
            
        }while(x <= 100);
        
        x = 0;
        
        //Estrutura while
        
        while(x <= 100) {
            
            if((x % 2) != 0) {                
                System.out.println("Números Impares: " + x);            
            }
            
            x++;            
        }
        
        x = 0;
        
        //Estrutura for
        
        for(int y = x; y <= 100; y++) {
            
            if((y % 2) == 0) {                
                y++;               
            }    
            
            System.out.println("Números Impares: " + y);              
        }
    }    
}
