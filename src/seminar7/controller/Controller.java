package seminar7.controller;

import seminar7.model.ComplexNum;
import seminar7.service.*;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {
    Scanner in = new Scanner(System.in);

    public ComplexNum enterNum() {
        System.out.print("Введите действительную часть: ");
        double realNum = in.nextDouble();
        System.out.print("Введите мнимую часть: ");
        double imagNum = in.nextDouble();
        return new ComplexNum(realNum, imagNum);
    }

    public void complexCalc() throws IOException {
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = new FileHandler("log.txt", true);
        logger.addHandler(fileHandler);
        System.out.println("Введите первое комплексное число");
        ComplexNum firstNum = enterNum();
        System.out.println("Введите второе комплексное число");
        ComplexNum secondNum = enterNum();
        System.out.print("Введите операцию (+, -, *, /): ");
        String operation = in.next();
        switch (operation) {
            case "+"-> {
                ComplexCalc complexCalc = new ComplexCalcAddition();
                ComplexNum result = complexCalc.calcOperation(firstNum, secondNum);
                complexCalc.calcPrint(result);
                logger.log(Level.INFO, result.toString());
            }
            case "-" -> {
                ComplexCalc complexCalc = new ComplexCalcSubtraction();
                ComplexNum result = complexCalc.calcOperation(firstNum, secondNum);
                complexCalc.calcPrint(result);
                logger.log(Level.INFO, result.toString());
            }
            case "*" -> {
                ComplexCalc complexCalc = new ComplexCalcMultiplication();
                ComplexNum result = complexCalc.calcOperation(firstNum, secondNum);
                complexCalc.calcPrint(result);
                logger.log(Level.INFO, result.toString());
            }
            case "/" -> {
                ComplexCalc complexCalc = new ComplexCalcDivision();
                ComplexNum result = complexCalc.calcOperation(firstNum, secondNum);
                complexCalc.calcPrint(result);
                logger.log(Level.INFO, result.toString());
            }
            default -> {
                String warningResult = "";
                logger.log(Level.WARNING, warningResult);
            }
        }
        fileHandler.close();
    }
}
