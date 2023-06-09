package seminar3;

public class Water extends Product {

    @Override
    public String getName() {
        return super.name;
    }

    public Water(String name, Long price) {
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
    public Long getPrice() {
        return super.price;
    }

    @Override
    public void setPrice(Long price) {
        super.price = price;
    }
}
