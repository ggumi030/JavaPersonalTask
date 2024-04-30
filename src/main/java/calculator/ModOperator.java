package calculator;

public class ModOperator implements Operator{
    public double operate(int firstNum, int secondNum) throws ArithmeticException{
        return OperatorType.REMAINDER.apply(firstNum,secondNum);
    }
}
