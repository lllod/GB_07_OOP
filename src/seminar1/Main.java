/*
1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре.
3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику,
заложенную в программе.
4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре.
 */

package seminar1;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Water
        WaterVendingMachine wvm = new WaterVendingMachine();
        Product bonAqua = new Water("bonAqua", 50);
        Product redKey = new Water("redKey", 60);
        LinkedList<Product> l = new LinkedList<>();
        l.add(bonAqua);
        l.add(redKey);
        wvm.putProduct(l);
        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());

        // HotDrinks
        HotDrinkVendingMachine hotDrinks = new HotDrinkVendingMachine();
        Product tea = new HotDrink("Tea", 10, 80);
        Product coffee = new HotDrink("Coffee", 25, 85);
        Product mulledWine = new HotDrink("Mulled wine", 30, 90);
        Product cocoa = new HotDrink("Cocoa", 20, 70);
        LinkedList<Product> hotDrinksList = new LinkedList<>();
        hotDrinksList.add(tea);
        hotDrinksList.add(coffee);
        hotDrinksList.add(cocoa);
        hotDrinksList.add(mulledWine);
        hotDrinks.putProduct(hotDrinksList);
        System.out.println(hotDrinks.getProduct());
        System.out.println(hotDrinks.getProduct());
        System.out.println(hotDrinks.getProduct());
        System.out.println(hotDrinks.getProduct());



    }
}