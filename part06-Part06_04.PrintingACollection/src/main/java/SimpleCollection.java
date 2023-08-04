
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        String eOutput = "";
        
        if (elements.size() == 1 ) {
            return "The collection "+ this.name +" has 1 element:\n" + elements.get(0);
        } 
        if (elements.size() > 1 ){
            String output = "The collection "+ this.name +" has " + elements.size() + " elements:";
            for (String e : elements) {
                eOutput = eOutput + "\n"+e;
            }
            return output + eOutput;
        }
        return "The collection "+ this.name +" is empty.";
    } 
    
}
