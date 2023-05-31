package seminar1;

import java.util.LinkedList;

public class HotDrinkVendingMachine implements VendingMachine{
    private LinkedList<Product> hotDrinks;

    @Override
    public void putProduct(LinkedList<Product> item) {
        this.hotDrinks = item;
    }

    @Override
    public Product getProduct() {
        return hotDrinks.pollLast();
    }
}
