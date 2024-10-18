import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] lista = new Product[n];


        for (int i = 0; i < lista.length; i++){
            System.out.print("digite um numero: ");
            int valor = sc.nextInt();
            lista[i] = new Product(valor);
        }

        System.out.println("\nNÚMEROS NEGATIVOS:");

        for (Product product : lista) {
            if (product.getN() < 0) {
                System.out.println(product.getN());
            }
        }

        sc.close();
    }
}