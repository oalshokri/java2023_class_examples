package Ch3;

public class Account {
    private double balance = 0;

    void deposit(double amount){
        balance = balance + amount;
    }
    boolean withdraw(double amount){
        if(amount > balance){
            return false;
        }
        balance = balance - amount;

        return  true;
    }
    double getBalance(){
        return  balance;
    }
}

class MyBank{
    public static void main(String[] args) {
        Account osamaAccount = new Account();
        osamaAccount.deposit(100);
        boolean result = osamaAccount.withdraw(300);
       if(result){
           System.out.println("withdraw done");
       }else{
           System.out.println("balance not enough");
       }
    }
}
