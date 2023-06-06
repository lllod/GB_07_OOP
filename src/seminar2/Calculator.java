package seminar2;
public abstract class Calculator implements MathematicsOperations{
    protected double resultNull = 0;
    public abstract double goOn(double firstNum, String operation, double secondNum);
}
