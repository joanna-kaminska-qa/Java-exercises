import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {

        ComputerItems computer = new ComputerItems();
        computer.displayItems();
    }
}

class ComputerItems {
    ArrayList<String> lista = new ArrayList<String>();

    public ComputerItems() {
        this.lista.add("mouse");
        this.lista.add("test");
        this.lista.add("kodilla");
        this.lista.add("keyboard");
    }

    public void displayItems() {
        for (int i = 0; i < this.lista.size(); i++) {
            String element = this.lista.get(i);
            if (element.length() > 5) {
                System.out.println(element);
            }
        }
    }
}