package seminar7.service;

import seminar7.model.ComplexNum;

public interface ComplexCalc {
    ComplexNum calcOperation(ComplexNum firstNum, ComplexNum secondNum);
    void calcPrint(ComplexNum complexNum);
}
