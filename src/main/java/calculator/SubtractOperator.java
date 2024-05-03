package calculator;

public class SubtractOperator<T extends Number> implements Operator<T>{

    public final Class<T> type;

    public SubtractOperator(Class<T> type){
        this.type = type;
    }

    public T operate(T firstNum, T secondNum) {

        //언박싱
        double firstnum = (double) firstNum;
        double secondnum = (double) secondNum;

        Number result = firstnum - secondnum;
        return NumberConversionUtils.convertNumberType(result,this.type);
//        return OperatorType.MINUS.apply(firstNum,secondNum);
    }
}
