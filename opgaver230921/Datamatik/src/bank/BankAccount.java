package bank;
public class BankAccount {
    private float balance;
    private String owner;
    private int stalkingCounter = 0;

    public BankAccount(String owner){
        this.owner = owner;
        this.balance=balance;
    }
    public float getBalance(){
        stalkingCounter++;
        return balance;

    }
    public String getOwner(){
        return owner;
    }
}
