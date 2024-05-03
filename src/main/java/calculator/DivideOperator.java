package calculator;

public class DivideOperator<T extends Number> implements Operator<T>{

    public final Class<T> type;

    public DivideOperator(Class<T> type){
        this.type = type;
    }


    public T operate(T firstNum, T secondNum) throws ArithmeticException{

//        //언박싱
//        double firstnum = (double) firstNum;
//        double secondnum = (double) secondNum;
        double firstnum = firstNum.doubleValue();
        double secondnum = secondNum.doubleValue();

        //연산
        if(secondnum == 0){
            throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }else{
            double result = firstnum / secondnum;
            return NumberConversionUtils.convertNumberType(result,type);
        }

        //enum
//        return OperatorType.DIVIDE.apply(firstNum,secondNum);
    }
}
