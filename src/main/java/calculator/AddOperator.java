package calculator;

public class AddOperator<T extends Number> implements Operator<T>{

    public final Class<T> type; //Double.class
//    public Class<Double> = Double.class;

    public AddOperator(Class<T> type){
        this.type = type;
        System.out.println();
    }

    public T operate( T firstNum,  T secondNum) {
        Number result = firstNum.doubleValue() + secondNum.doubleValue();
        return NumberConversionUtils.convertNumberType(result,type);
    }
}
