
public class YourFirstAccount {

    public static void main(String[] args) {
        
        Account myAccount = new Account("Agata", 100.0);
        myAccount.deposit(20);
        System.out.println(myAccount);
    }
}
