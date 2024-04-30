package calculator;

public class DivideOperator implements Operator{
    public double operate(int firstNum, int secondNum) throws ArithmeticException{
        if(secondNum == 0){
            throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }else{
            return firstNum / secondNum;
        }
    }
}
