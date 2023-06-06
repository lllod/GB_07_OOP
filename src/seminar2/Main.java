/*
Написать калькулятор в ООП стиле(инкапсуляция, наследованеи. полиморфизм)
 */


package seminar2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        taskCalculator calculator = new taskCalculator();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double firstNum = in.nextDouble();
        System.out.print("Введите второе число: ");
        double secondNum = in.nextDouble();
        System.out.print("Введите операцию (сложение, вычитание, умножение, деление: ");
        String operation = in.next();

        System.out.println(calculator.goOn(0, "-", 0));
//        System.out.println(calculator.goOn(1, " ", 0));
        System.out.println(calculator.goOn(2, "+", 3));
        System.out.println(calculator.goOn(2, "-", 3));
        System.out.println(calculator.goOn(2, "/", 3));
        System.out.println(calculator.goOn(2, "*", 3));
        System.out.println(calculator.goOn(firstNum, operation, secondNum));
    }
}
