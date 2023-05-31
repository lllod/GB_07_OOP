package seminar1;

public class HotDrink extends Product{
    private int temperature;

    public HotDrink(String name, int price, int temperature){
        this.temperature = temperature;
        super.name = name;
        super.price = price;
    }

    @Override
    public String getName() {
        return super.name;
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

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink: " + name + '\n' + "Temperature: " + temperature + " °C \n" + "Price: " + price + " ₽ \n";
    }
}
