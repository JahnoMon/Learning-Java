package applications;

import entities.TesteProduto;
import java.util.Scanner;
import java.util.Locale;


public class TestePrograma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // definir o local padrão

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is therena initial deposit (y/n)? ");
        String isDeposit = sc.nextLine();

        double deposit = 0;
        if(isDeposit.equals("y")){
            System.out.print("Enter initial deposit value: ");
            deposit = sc.nextDouble();
        }

        TesteProduto conta = new TesteProduto(number, name, isDeposit, deposit);
        System.out.println(conta);

        System.out.println();

        TesteProduto produto2 = new TesteProduto("Lukitas", 1);

        System.out.println(produto2);


        sc.close();
    }
}
