package calculator;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Double> arrList = new ArrayList<>();

    public double calculate(int firstNum, int secondNum, String opterator) throws ArithmeticException{
        double result = 0.0;

        switch (opterator){
            case "+" : result = firstNum + secondNum;
            arrList.add(result);
            break;
            case "-" : result = firstNum - secondNum;
            arrList.add(result);
            break;
            case "*" : result = firstNum * secondNum;
            arrList.add(result);
            break;
            case "/" :
                if(secondNum == 0){
                    throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }else{
                    result = (double)firstNum / secondNum;
                    arrList.add(result);
                }
                break;
            default:
                throw new ArithmeticException("올바른 연산자를 입력해주세요 (사칙연산 연산자 : +, -, *, /)");
        }

        return result;
    }



}
