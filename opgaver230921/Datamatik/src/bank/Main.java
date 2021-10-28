package bank;
public class Main {
    
    

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(owner : "Benny");
        
    BankAccount a2 = new BankAccount(owner Egon);
    
    BankAccount a3 = new BankAccount( owner: "Kjeld");

        printAccounts(a1);

        
    }
    public static void printAccounts(BankAccount account){
        System.out.println(account.getOwner());
    }

}