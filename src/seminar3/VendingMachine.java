package seminar3;

import java.util.LinkedList;

public interface VendingMachine {
    public void putProduct(LinkedList<Product> item);

    public Product getProduct();
}