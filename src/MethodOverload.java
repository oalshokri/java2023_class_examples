public class MethodOverload {

    public  static void main(String args[]){
        sum(2,3,1);
    }

    static void sum(int x,int y){
        System.out.println("first sum");
        System.out.println(x+y);
    }
    static void sum(int x,int y,int z){
        System.out.println("second sum");
        System.out.println(x+y+z);
    }

}
