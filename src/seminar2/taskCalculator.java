package seminar2;

public class taskCalculator extends Calculator{
    private double getNull() {
        return super.resultNull;
    }

    @Override
    public double goOn(double firstNum, String operation, double secondNum){
        if (firstNum == 0 && secondNum == 0) {
            return getNull();
        }
        return switch (operation) {
            case ("+") -> addition(firstNum, secondNum);
            case ("-") -> subtraction(firstNum, secondNum);
            case ("*") -> multiplication(firstNum, secondNum);
            case ("/") -> division(firstNum, secondNum);
            default -> throw new IllegalStateException("Калькулятор не знаком с такой операцией: " + operation);
        };
    }

    @Override
    public Double addition(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    @Override
    public Double subtraction(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    @Override
    public Double multiplication(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    @Override
    public Double division(double firstNum, double secondNum) {
        return firstNum / secondNum;
    }
}
