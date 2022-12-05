package Del2;

import java.util.UUID;

public class SavingAccount extends BankAccount {
    SavingAccount(){
        this.setAccountNumber(UUID.randomUUID().toString().substring(0,6));
        this.setAccountType("SavingAccount");
        this.setBalance(0);
    }

}
