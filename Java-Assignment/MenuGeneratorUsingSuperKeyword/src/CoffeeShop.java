import java.util.Scanner;

class Drink {
    String name;
    double price;

    Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Drink: " + name + ", Price: Rwf " + price);
    }
}

class Coffee extends Drink {
    Coffee(String name, double price) {
        super(name, price);
    }
}

class Tea extends Drink {
    Tea(String name, double price) {
        super(name, price);
    }
}

class Size {
    String name;
    double price;

    Size(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Size: " + name + ", Price: Rwf " + price);
    }
}

class Small extends Size {
    Small(String name, double price) {
        super(name, price);
    }
}

class Medium extends Size {
    Medium(String name, double price) {
        super(name, price);
    }
}

class Large extends Size {
    Large(String name, double price) {
        super(name, price);
    }
}

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Coffee Shop Menu");
        System.out.println("1. Coffee");
        System.out.println("2. Tea");
        System.out.println("Choose your drink (1 or 2): ");
        int choice = input.nextInt();

        Drink drink;
        if (choice == 1) {
            drink = new Coffee("Coffee", 500);
        } else {
            drink = new Tea("Tea", 1000);
        }

        System.out.println("Choose your size:");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");
        int sizeChoice = input.nextInt();

        Size size;
        if (sizeChoice == 1) {
            size = new Small("Small", 500.0);
        } else if (sizeChoice == 2) {
            size = new Medium("Medium", 1000.0);
        } else {
            size = new Large("Large", 2000.0);
        }

        System.out.println("Your order: ");
        drink.display();
        size.display();
        System.out.println("Total: Rwf " + (drink.price + size.price));
    }
}
// The super keyword is used in the constructor of the subclasses to call the constructor of the superclass.


