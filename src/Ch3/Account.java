package Ch3;

public class Account {
    private double balance;
    private int accountNumber;

    public Account(int accountNumber,double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    double deposit(double amount){
        balance = balance + amount;
        return  amount;
    }
    double withdraw(double amount){
        if(amount > balance || amount == 0){
            return 0;
        }
        balance = balance - amount;

        return  amount;
    }
    double getBalance(){
        return  balance;
    }
    int getAccountNumber(){
        return  accountNumber;
    }
}

class MyBank{
    public static void main(String[] args) {
        Account myAccount = new Account(12,300);
        System.out.println("Account Number: "+myAccount.getAccountNumber());
        System.out.println("your balance: " +myAccount.getBalance());

        double d = myAccount.deposit(100);
        System.out.println("deposit done, amount:"+ d);
        System.out.println("your balance: " +myAccount.getBalance());

        double result = myAccount.withdraw(300);
       if(result != 0){
           System.out.println("withdraw done, amount: "+result);
           System.out.println("your balance: " +myAccount.getBalance());
       }else{
           System.out.println("balance not enough");
       }
    }
}
