/*
1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре.
3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику,
заложенную в программе.
4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре.
 */

package seminar3;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Water
        WaterVendingMachine wvm = new WaterVendingMachine();
        Product bonAqua = new Water("bonAqua", 50L);
        Product redKey = new Water("redKey", 60L);
        LinkedList<Product> l = new LinkedList<>();
        l.add(bonAqua);
        l.add(redKey);
        wvm.putProduct(l);
//        System.out.println(wvm.getProduct());
//        System.out.println(wvm.getProduct());

        // HotDrinks
        HotDrinkVendingMachine hotDrinks = new HotDrinkVendingMachine();
        Product tea = new HotDrink("Tea", 10L, 80);
        Product coffee = new HotDrink("Coffee", 25L, 85);
        Product mulledWine = new HotDrink("Mulled wine", 30L, 90);
        Product cocoa = new HotDrink("Cocoa", 20L, 70);
        Product cocoa2 = new HotDrink("Cocoa", 40L, 70);
        Product cocoa3 = new HotDrink("Cocoa", 39L, 70);
        LinkedList<Product> hotDrinksList = new LinkedList<>();
        hotDrinksList.add(tea);
        hotDrinksList.add(coffee);
        hotDrinksList.add(cocoa);
        hotDrinksList.add(mulledWine);
        hotDrinksList.add(cocoa2);
        hotDrinksList.add(cocoa3);
        hotDrinks.putProduct(hotDrinksList);
//        System.out.println(hotDrinks.getProduct());
//        System.out.println(hotDrinks.getProduct());
//        System.out.println(hotDrinks.getProduct());
//        System.out.println(hotDrinks.getProduct());



//        Seminar 3
        System.out.println("<!----------!>");

        List<Product> list = hotDrinks.getAllHotDrinks();
        System.out.println(list.toString());

        System.out.println("--------------");

        List<Product> list2 = hotDrinks.getAllHotDrinks().stream().sorted().toList();
        System.out.println(list2.toString());

    }
}