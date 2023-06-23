package seminar7.service;

import seminar7.model.ComplexNum;

public class ComplexCalcDivision implements ComplexCalc {
    @Override
    public ComplexNum calcOperation(ComplexNum firstNum, ComplexNum secondNum) {
        double numenator = ((firstNum.getReal() * secondNum.getReal() - firstNum.getReal() * secondNum.getImag()) +
                        (firstNum.getImag() * secondNum.getReal() - firstNum.getImag() * secondNum.getImag()));
        double denominator = secondNum.getReal() * secondNum.getReal() + secondNum.getImag() * secondNum.getImag();

        return new ComplexNum(numenator, denominator);
    }

    @Override
    public void calcPrint(ComplexNum complexNum) {
        complexNum.soutComplex();
    }
}
