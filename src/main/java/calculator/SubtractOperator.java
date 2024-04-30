package calculator;

public class SubtractOperator implements Operator{
    public double operate(int firstNum, int secondNum) throws ArithmeticException {
        return OperatorType.MINUS.apply(firstNum,secondNum);
    }
}
