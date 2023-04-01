import java.util.Scanner;

public class EmpSal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary in $");
        double salary = sc.nextDouble();
        System.out.println("Enter avg of your daily paid in NIS");
        double dailyPaidNIS = sc.nextDouble();

        double monthPaidNIS = dailyPaidNIS*30;
        double monthSaveUSD = salary - (monthPaidNIS/3.6);

        System.out.print("your Salary in USD: "+salary);
        System.out.print(" - your Salary in NIS: "+salary*3.6);
        System.out.print(" - your Salary in JOD: "+salary*0.7);
        System.out.println();
        System.out.println("Month paid in USD: "+monthPaidNIS/3.6);
        System.out.println("Month Saving in USD: "+monthSaveUSD);
    }
}
