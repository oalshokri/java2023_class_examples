import java.util.Scanner;
public class MySum {
    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        System.out.println("Enter first num");
        int n1 = mySc.nextInt();
        System.out.println("Enter Second num");
        int n2 = mySc.nextInt();
        System.out.println("Sum is:" + sum(n1,n2));
    }
    static int sum(int num1, int num2){
        return  num1 + num2;
    }
}
