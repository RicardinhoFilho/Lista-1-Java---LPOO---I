
public class E1 {
    public static void main(String[] args) {
        /*
            
        Faça um programa que apresente os números de 1 a 10, sendo que cada número deve ser
impresso em uma linha e os números ímpares deslocados (\t) a direita.
        
         */
            
        int i; 
        
        for(i = 1; i<=10; i ++ ){
            
            if(i%2 == 0){
                System.out.println(i);
            }else{
                 System.out.printf("\t %d \n",i);
            }
            
            
        }
    }

}
