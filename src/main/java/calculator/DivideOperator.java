package calculator;

public class DivideOperator implements Operator{
    public double operate(int firstNum, int secondNum) throws ArithmeticException{
        return OperatorType.DIVIDE.apply(firstNum,secondNum);
    }
}
