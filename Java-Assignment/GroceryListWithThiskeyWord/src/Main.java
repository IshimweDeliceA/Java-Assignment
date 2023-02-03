import java.util.ArrayList;
import java.util.Scanner;

class GroceryItem {
    private String itemName;

    public GroceryItem(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }
}

class GroceryList {
    private ArrayList<GroceryItem> items;

    public GroceryList() {
        items = new ArrayList<GroceryItem>();
    }

    public void addItem(GroceryItem item) {
        items.add(item);
        System.out.println("Item added: " + item.getItemName());
    }

    public void removeItem(GroceryItem item) {
        items.remove(item);
        System.out.println("Item removed: " + item.getItemName());
    }

    public void displayList() {
        System.out.println("Grocery List:");
        for (GroceryItem item : items) {
            System.out.println("- " + item.getItemName());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GroceryList list = new GroceryList();

        while (true) {
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scan.next();
                    GroceryItem item = new GroceryItem(itemName);
                    list.addItem(item);
                    break;
                case 2:
                    System.out.print("Enter item name: ");
                    itemName = scan.next();
                    item = new GroceryItem(itemName);
                    list.removeItem(item);
                    break;
                case 3:
                    list.displayList();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
//this is used in the constructor of the GroceryItem class to distinguish between the instance variable itemName and the parameter itemName.
//Without using this, the parameter would shadow the instance variable and the constructor would not be able to initialize the itemName instance variable. By using this, we ensure that the instance variable is being initialized and not the parameter.