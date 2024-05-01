package calculator;

public class DivideOperator<T extends Number> implements Operator<T>{
    public double operate(T firstNum, T secondNum) throws ArithmeticException{

        //언박싱
        double firstnum = (double) firstNum;
        double secondnum = (double) secondNum;

        //연산
        if(secondnum == 0){
            throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }else{
            return firstnum / secondnum;
        }

        //enum
//        return OperatorType.DIVIDE.apply(firstNum,secondNum);
    }
}
