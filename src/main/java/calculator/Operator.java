package calculator;

public interface Operator<T extends Number> {
    public double operate(T firstNum, T secondNum) throws ArithmeticException;
}
