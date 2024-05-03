package calculator;

public class AddOperator<T extends Number> implements Operator<T>{

    public final Class<T> type;

    public AddOperator(Class<T> type){
        this.type = type;
    }

    public T operate( T firstNum,  T secondNum) throws ArithmeticException{
        //언박싱
//        double firstnum = (double) firstNum;
//        double secondnum = (double) secondNum;
        Number result = firstNum.doubleValue() + secondNum.doubleValue();

        return NumberConversionUtils.convertNumberType(result,this.type);
    }
}
