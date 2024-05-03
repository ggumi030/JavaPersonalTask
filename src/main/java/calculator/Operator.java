package calculator;

public interface Operator<T extends Number> {
    public T operate(T firstNum, T secondNum) throws ArithmeticException;
}
