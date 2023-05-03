package Ch3;

public class Counter {
    private int value = 0;
     void count(){
//        value = value +1;
        value++;
    }
    int getResult(){
        return value;
    }
    void reset(){
        value = 0;
    }
}

class MyTest{
    public static void main(String[] args) {
        Counter c1 = new Counter();

        c1.count();
        c1.count();

        int result = c1.getResult();

        System.out.println(result);
        c1.reset();
        System.out.println(c1.getResult());

    }
}

