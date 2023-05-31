package seminar1;

public class Water extends Product {

    @Override
    public String getName() {
        return super.name;
    }

    public Water(String name, int price) {
        super.name = name;
        super.price = price;
    }

    @Override
    public String toString() {
        return "Water: " + name + '\n' + "Price: " + price + " ₽ \n";
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public int getPrice() {
        return super.price;
    }

    @Override
    public void setPrice(int price) {
        super.price = price;
    }
}
