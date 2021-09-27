
public class E5 {

    public static void main(String[] args) {
        // Faça um programa que apresente as 6 primeiras linhas do triangulo de pascal.
        System.out.println(1);
        for (int l = 1; l <= 5; l++) {
            int valor = 1;

            valor = 1;
            System.out.print(valor + " ");

            for (int c = 1; c <= l; c++) {
                valor = (valor * (l - c + 1)) / c;
                System.out.print(valor + " ");
            }
            System.out.println("  ");
        }
    }
}
