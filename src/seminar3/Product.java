package seminar3;

public abstract class Product {
    // Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
    // содержащий
    // в себе методы initProducts (List <Product>) сохраняющий в себе список
    // исходных продуктов и
    // getProduct(String name)

    protected String name;
    protected Long price;

    public abstract String getName();

    public abstract void setName(String name);

    public abstract Long getPrice();

    public abstract void setPrice(Long price);
}