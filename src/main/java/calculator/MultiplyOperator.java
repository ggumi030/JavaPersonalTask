package calculator;

public class MultiplyOperator<T extends Number> implements Operator<T>{

    public final Class<T> type;

    public MultiplyOperator(Class<T> type){
        this.type = type;
    }

    public T operate(T firstNum, T secondNum) throws ArithmeticException {

        //언박싱
        double firstnum = (double) firstNum;
        double secondnum = (double) secondNum;

        Number result = firstnum * secondnum;
        return NumberConversionUtils.convertNumberType(result,type);
//        return OperatorType.MULTIPLY.apply(firstNum,secondNum);
    }
}
