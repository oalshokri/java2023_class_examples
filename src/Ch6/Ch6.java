package Ch6;

public class Ch6 {
    public static void main(String[] args) {
//        double balance = 100;
//        int years = 0;
//        double target = 2000;
//        double rate = 1;
//
//        while (balance<target) {
//           years++;
//           double s = balance * rate;
//           balance = balance +s;
//        }
//
//        System.out.println(years);

//        for (int i = 0; i<5; i++){
//            System.out.println(i);
//        }

//        for(int i = 3 ; i>0; i--){
//            System.out.println(i);
//        }

//        int i = 3;
//        while (i>0){
//            System.out.println(i);
//            i--;
//        }

//        int[] numbers = new int[3];
//
//        int amount = 550;
//
//        for(int i = 0 ; i<numbers.length;i++)
//            numbers[i] *=i+amount -3000  ;
//
//        for(int item : numbers)
//            System.out.println(amount);

        String[] names = {"ahmed","ali","bob"};

        for(int i = 0 ; i<names.length;i++){
            if(i>0)
            System.out.print(" |"+" "+ names[i]);
            else
                System.out.print(names[i]);
        }

    }
}
