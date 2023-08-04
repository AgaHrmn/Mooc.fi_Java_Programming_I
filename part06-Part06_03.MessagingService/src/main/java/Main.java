
public class Main {

    public static void main(String[] args) {

        MessagingService ms = new MessagingService();
        Message mess1 = new Message("Agata", "Testing...");
        Message mess2 = new Message("Dino", "Woof woof!");
        
        ms.add(mess1);
        ms.add(mess2);
        
        System.out.println(ms.getMessages());
    }
}
