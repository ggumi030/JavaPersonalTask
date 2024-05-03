package calculator;

public class MultiplyOperator<T extends Number> implements Operator<T>{

    public final Class<T> type;

    public MultiplyOperator(Class<T> type){
        this.type = type;
    }

    public T operate(T firstNum, T secondNum) {
        //언박싱
        Number result = (double) firstNum * (double) secondNum;
        return NumberConversionUtils.convertNumberType(result,type);
//        return OperatorType.MULTIPLY.apply(firstNum,secondNum);
    }
}
