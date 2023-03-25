import java.util.Scanner;

public class MyScanner {
    public static void main(String args[]){
        int pass = 123456;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        if(data == pass){
            System.out.println("welcome");
        }else{
            System.out.println("wrong password");
        }

    }
}
