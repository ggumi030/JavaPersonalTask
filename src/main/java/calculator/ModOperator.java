package calculator;

public class ModOperator<T extends Number> implements Operator<T>{

    public final Class<T> type;

    public ModOperator(Class<T> type){
        this.type = type;
    }


    public T operate(T firstNum, T secondNum) {

        //언박싱
        double firstnum = (double) firstNum;
        double secondnum = (double) secondNum;

        Number result = firstnum % secondnum;

        return NumberConversionUtils.convertNumberType(result,type);


//        return OperatorType.REMAINDER.apply(firstNum,secondNum);
    }
}
