package Del2;

import java.util.UUID;

public class BankAccount implements BankOperations {

   private String accountNumber;
   private String accountType;
    private double balance;
    public BankAccount(){
        this.accountNumber= UUID.randomUUID().toString().substring(0,6);
        this.accountType="Bank account";
        this.balance=0;

    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setAccountNumber(String accountNumber) {

        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
       return this.accountNumber;
    }
    public String getAccountType(){
        return this.accountType;
    }
    public double getBalance(){
       return this.balance;
    }
   @Override
   public void withDrawMoney(double amount){
      // System.out.println(this.balance-amount);
       this.balance -=amount;
       if(this.balance-amount<=0){
           System.out.println("det finns ingen belopp");
    }




    }

    @Override
    public void depositMoney(double amount) {
        this.balance +=amount;
    }
    @Override
    public String toString(){
        String info = "[account number ="+ accountNumber+ "\t account type :"+ accountType +"\tbalance"+ balance+"]";
        return info;
    }
}
