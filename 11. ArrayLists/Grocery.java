public class Grocery {

    private String name;
    private double price;

    public Grocery(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String toString() {
        return this.name ": $" + this.price;
    }


    
}
