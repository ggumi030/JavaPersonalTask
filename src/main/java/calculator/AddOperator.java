package calculator;

public class AddOperator implements Operator{
    public double operate(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}