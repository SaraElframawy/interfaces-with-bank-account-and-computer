package Del2;

import java.util.UUID;

public class PersonalAccount extends BankAccount {
    public PersonalAccount(){
        this.setAccountNumber(UUID.randomUUID().toString().substring(0,6));
        this.setAccountType("Personal account ");
        this.setBalance(0);
    }
}
