package seminar7.service;

import seminar7.model.ComplexNum;

public class ComplexCalcMultiplication implements ComplexCalc{
    @Override
    public ComplexNum calcOperation(ComplexNum firstNum, ComplexNum secondNum) {
        return new ComplexNum(firstNum.getReal() * secondNum.getReal() -
                firstNum.getImag() * secondNum.getImag(),
                firstNum.getImag() * secondNum.getReal() +
                firstNum.getReal() * secondNum.getImag());
    }

    @Override
    public void calcPrint(ComplexNum complexNum) {
        complexNum.soutComplex();
    }
}
