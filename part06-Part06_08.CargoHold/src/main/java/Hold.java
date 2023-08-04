import java.util.ArrayList;

public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> luggage;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.luggage = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            luggage.add(suitcase);
        }
    }
    
    public int totalWeight() {
        int luggageWeight = 0;

        for (Suitcase s : luggage) {
            luggageWeight += s.totalWeight();
        }
        return luggageWeight;
    }
    
    public void printItems() {
        for (Suitcase s : luggage) {
            s.printItems();
        }
    }
    
    public String toString() {
        if (luggage.isEmpty()) {
            return "no suitcases (" + this.totalWeight() + " kg)";
        } else if (luggage.size() == 1) {
            return luggage.size() + " suitcase (" + this.totalWeight() + " kg)";
        } else {
            return luggage.size() + " suitcases (" + this.totalWeight() + " kg)";
        }
    }
    
}
