
import java.util.HashMap;
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
        
    }

    public void start() {
        boolean flag = true;
        
        while (flag) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            switch (command) {
                
                case "end" :
                    System.out.println("Bye bye!");
                    flag = false;
                    break;
               
                case "add":
                    System.out.println("Word: ");
                    String newWord = scanner.nextLine();
                    
                    System.out.println("Translation: ");
                    String newTranslation = scanner.nextLine();
                    
                    
                    if (!this.dictionary.dict().containsKey(newWord)) {
                        dictionary.add(newWord, newTranslation);
                        System.out.println(dictionary.dict());
                    }
                    break;
                case "search":
                    System.out.println("To be translated: ");
                    String searchedWord = scanner.nextLine();
                    
                    if (!this.dictionary.dict().containsKey(searchedWord)) {
                        System.out.println("Word " + searchedWord + " was not found");
                    } else {
                        System.out.println("Translation: " + this.dictionary.translate(searchedWord));
                    }
                    break;
                default:
                    System.out.println("Unknown command");
                    break;

            }
            
        }
    }
}
