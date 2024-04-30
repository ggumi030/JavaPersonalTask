package calculator;

public class ModOperator implements Operator{
    public double operate(int firstNum, int secondNum) {
        return firstNum % secondNum;
    }
}
