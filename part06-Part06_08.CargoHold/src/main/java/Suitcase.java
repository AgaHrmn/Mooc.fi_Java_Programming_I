
import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int max) {
        this.items = new ArrayList<>();
        this.maxWeight = max;
    }

    public void addItem(Item item) {

        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            items.add(item);
        }
    }

    public void printItems() {
        for (Item i : items) {
            System.out.println(i);
        }
    }

    public int totalWeight() {
        int suitcaseWeight = 0;

        for (Item i : items) {
            suitcaseWeight += i.getWeight();
        }
        return suitcaseWeight;
    }

    public Item heaviestItem() {

        if (items.isEmpty()) {
            return null;
        }

        Item heaviestItem = items.get(0);

        for (Item i : items) {
            if (i.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = i;
            }
        }
        return heaviestItem;
    }
    
    public String toString() {
        if (items.isEmpty()) {
            return "no items (" + this.totalWeight() + " kg)";
        } else if (items.size() == 1) {
            return items.size() + " item (" + this.totalWeight() + " kg)";
        } else {
            return items.size() + " items (" + this.totalWeight() + " kg)";
        }
    }
}
