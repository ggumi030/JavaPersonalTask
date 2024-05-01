package calculator;

public class AddOperator implements Operator{
    public double operate( int firstNum,  int secondNum) throws ArithmeticException{
        return OperatorType.PLUS.apply(firstNum,secondNum);
    }
}
