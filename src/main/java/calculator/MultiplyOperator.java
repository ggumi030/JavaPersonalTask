package calculator;

public class MultiplyOperator implements Operator{
    public double operate(int firstNum, int secondNum) throws ArithmeticException {
        return OperatorType.MULTIPLY.apply(firstNum,secondNum);
    }
}
