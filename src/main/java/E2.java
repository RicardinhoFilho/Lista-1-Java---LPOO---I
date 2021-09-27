
public class E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
             Faça um programa que apresente os números de 1 a 15 na forma de um triangulo, como
                apresentado a seguir:
                1
                2 3
                4 5 6
                7 8 9 10
                11 12 13 14 15
                Utilize nesse exercício apenas 1 laço
         */

        int i, num = 0, j = 0;

        for (i = 1; i <= 15; i++) {
            System.out.printf("%d", i);
            j++;
            if (j > num) {
                j = 1;
                num += 1;
                System.out.print("\n");
            }

        }

    }

}
