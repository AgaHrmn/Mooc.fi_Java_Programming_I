import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> toDo;

    public TodoList() {
        this.toDo = new ArrayList<>();
    }

    public void add(String task) {
        this.toDo.add(task);
    }

    public void print() {
        for (int i = 0; i < this.toDo.size(); i++) {
                System.out.println((i + 1) + ": " + toDo.get(i));
        }
    }

    public void remove(int number) {
        try {
            this.toDo.remove(number-1);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

