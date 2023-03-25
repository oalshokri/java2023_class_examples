import java.util.Scanner;

public class Profile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, dep, mobile;

        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your dep:");
        dep = sc.nextLine();
        System.out.println("Enter your mobile:");
        mobile = sc.nextLine();

        System.out.println("your information:");
        System.out.println("name: " + name);
        System.out.println("mobile: " + mobile);
        System.out.println("dep: " + dep);
    }
}
