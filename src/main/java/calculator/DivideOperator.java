package calculator;

public class DivideOperator<T extends Number> implements Operator<T>{

    public final Class<T> type;

    public DivideOperator(Class<T> type){
        this.type = type;
    }


    public T operate(T firstNum, T secondNum) throws ArithmeticException{
        //연산
        if(secondNum.doubleValue() == 0){
            throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }else{
            double result = firstNum.doubleValue() / secondNum.doubleValue();
            return NumberConversionUtils.convertNumberType(result,type);
        }

        //enum
//        return OperatorType.DIVIDE.apply(firstNum,secondNum);
    }
}
