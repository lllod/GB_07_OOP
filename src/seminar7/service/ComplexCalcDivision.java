package seminar7.service;

import seminar7.model.ComplexNum;

public class ComplexCalcDivision implements ComplexCalc {
    @Override
    public ComplexNum calcOperation(ComplexNum firstNum, ComplexNum secondNum) {
        double leftNum = ((firstNum.getReal() * secondNum.getReal() + firstNum.getImag() * secondNum.getImag()) /
                (secondNum.getReal() * secondNum.getReal() + secondNum.getImag() * secondNum.getImag()));
        double rightNum = ((firstNum.getImag() * secondNum.getReal() - firstNum.getReal() * secondNum.getImag()) /
                (secondNum.getReal() * secondNum.getReal() + secondNum.getImag() * secondNum.getImag()));



        return new ComplexNum(leftNum, rightNum);
    }

    @Override
    public void calcPrint(ComplexNum complexNum) {
        complexNum.soutComplex();
    }
}
