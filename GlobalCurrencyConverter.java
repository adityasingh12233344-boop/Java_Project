import java.util.Scanner;

public class GlobalCurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double amount, result = 0;
        int choice;

        System.out.println("====== GLOBAL CURRENCY CONVERTER ======");

        System.out.print("Enter Amount: ");
        amount = sc.nextDouble();

        System.out.println("\nChoose Currency:");
        System.out.println("1. USD to INR");
        System.out.println("2. EUR to INR");
        System.out.println("3. GBP to INR");

        System.out.print("Enter Choice: ");
        choice = sc.nextInt();

        switch (choice) {

            case 1:
                result = amount * 83;
                System.out.println("Converted Amount: ₹" + result);
                break;

            case 2:
                result = amount * 90;
                System.out.println("Converted Amount: ₹" + result);
                break;

            case 3:
                result = amount * 105;
                System.out.println("Converted Amount: ₹" + result);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}