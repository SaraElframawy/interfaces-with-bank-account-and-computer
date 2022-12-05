package Del2;


public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        SavingAccount savingAccount = new SavingAccount();
        System.out.println(bankAccount.toString());
        bankAccount.withDrawMoney(2);
        bankAccount.setBalance(30);
        bankAccount.withDrawMoney(-5);
        System.out.println(bankAccount.getBalance());
        PersonalAccount personalAccount = new PersonalAccount();
        personalAccount.depositMoney(70);
        System.out.println(personalAccount.toString());
        System.out.println(savingAccount.toString());
        savingAccount.setBalance(30);
        savingAccount.withDrawMoney(10);
        System.out.println(savingAccount.toString());


    }
}