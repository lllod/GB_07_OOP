package seminar3;

import java.util.LinkedList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private LinkedList<Product> hotDrinks;

    @Override
    public void putProduct(LinkedList<Product> item) {
        this.hotDrinks = item;
    }

    @Override
    public Product getProduct() {
        return hotDrinks.pollLast();
    }

    public List<Product> getAllHotDrinks() {
        return hotDrinks;
    }
}
