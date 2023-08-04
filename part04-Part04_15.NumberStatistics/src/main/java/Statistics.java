public class Statistics {

    private int count;
    private int number;
   

    public Statistics() {
        this.count = 0;
        this.number = 0;
        
    }

    public void addNumber(int number) {
        this.count += 1;
        this.number += number;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        
        return this.number;
    }

    public double average() {
        if (this.number == 0 ) {
            return 0;
        }
        return 1.0 * this.number / this.count;
    }
}
