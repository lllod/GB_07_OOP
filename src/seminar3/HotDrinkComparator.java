package seminar3;

import java.util.Comparator;

public class HotDrinkComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int resultOfComparing = o1.getPrice().compareTo(o2.getPrice());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getPrice().compareTo(o2.getPrice());
            if (resultOfComparing == 0) {
                return o1.getPrice().compareTo(o2.getPrice());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
