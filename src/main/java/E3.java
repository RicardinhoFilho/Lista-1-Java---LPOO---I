
public class E3 {

    public static void main(String[] args) {
        /*
            Faça um programa que apresente a tabela ASCII (0 a 255), no formato de 16x16, tendo a 1a
            linha e a 1a coluna rotulada com o valor em hexadecimal de 0 a F.
            Obs: Inicialmente, substitua os valores < 32 por 32, para evitar a impressão dos códigos de
            controle.
        */
        int i, asc, l,c;
        System.out.printf(" ");
        for(i=0; i < 16; i++){
            System.out.printf("%x ", i);
        }
         asc = 0;
         for(l=0; l < 16; l++){
            System.out.printf("%x ", l);
            
            for(c=0; c<16; c++){
                
                   if(asc>31){
                       
                    System.out.printf("%c ", (asc));   
                   
                   }else{
                       System.out.printf(" ");  
                   }
                   
                   asc+= 1;
                     System.out.printf(" ");  
                
            }
            
            System.out.printf("\n");  
            
        }
         
         
         
         
        
    }
    
}
