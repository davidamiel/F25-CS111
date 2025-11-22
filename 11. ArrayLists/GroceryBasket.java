import java.util.ArrayList;
public class GroceryBasket {

    private ArrayList<Grocery> groceries;
    private int numberOfItems;
    private double totalCost;

    public GroceryBasket() {
        this.numberOfItems = 0;
        this.totalCost = 0;
        this.groceries = new ArrayList<Grocery>();
    }

    public int getSize() {
        return this.numberOfItems;
    }

    public double getCost() {
        return this.totalCost;
    }

    public void addItem(Grocery newItem) {
        groceries.add(newItem);
        this.numberOfItems ++;
        this.totalCost += newItem.getPrice();
    }







    
}
