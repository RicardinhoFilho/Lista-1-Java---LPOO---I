
public class E4 {

    public static void main(String[] args) {
       /*
        Faça um programa que apresente os números primos menores que 100.
        */
        
       
        for (int i = 1; i <= 100 ; i++) {
        if (verificaPrimp(i)){
            System.out.printf("%s ",i);
        }
            
    }
       
       
    }
    
    private static boolean verificaPrimp(int numero) {
    for (int i = 2; i < numero; i++) {
        if (numero % i == 0)
            return false;   
    }
    return true;
}
    
    
}
