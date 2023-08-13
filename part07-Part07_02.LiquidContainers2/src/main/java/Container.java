
public class Container {

    int maxVolume;
    int volume;

    public Container() {
        this.maxVolume = 100;
        this.volume = 0;
    }

    public int contains() {
        return this.volume;
    }

    public void add(int amount) {
        if (amount < 0) {
            amount *= -1;
        }

        if (volume + amount <= 100) {
            volume += amount;
        } else {
            volume = 100;
        }

    }

    public void remove(int amount) {
        if (amount < 0) {
            amount *= -1;
        }

        if (volume - amount < 0) {
            volume = 0;
        } else {
            volume -= amount;
        }
    }

    public String toString() {
        return volume + "/100";
    }
}
