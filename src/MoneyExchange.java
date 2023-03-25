import java.util.Scanner;

public class MoneyExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome");
        System.out.println("Enter the amount in USD: ");
        double amount = scanner.nextDouble();
        System.out.println("your amount in NIS is: "+ amount * 3.6);
    }

}
