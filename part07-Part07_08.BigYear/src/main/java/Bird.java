
public class Bird {

    private String name;
    private String latinName;
    private int observation;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public void addObservation() {
        this.observation += 1;
    }
    
    public void addObservation(int count) {
        this.observation += count;
    }
    
    public String toString() {
        String output = this.name + "("+ this.latinName + "):" + this.observation + " observation";
        
        if (this.observation != 1  ) {
            output += "s";
        }
        return output;
    }
}
