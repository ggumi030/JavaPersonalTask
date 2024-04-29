package calculator;

import java.util.ArrayList;
import java.lang.Math;

public abstract class Calculator {
    //사칙 연산 컬렉션
    protected ArrayList<Double> arrList;
    //원의 넓이 컬렉션
    protected ArrayList<Double> circleList = new ArrayList<>();
    //파이 값
    public static final double PI = Math.PI;
    //파이 값은 변하지 않는 상수이기 때문에 final로 선언
    //객체 생성할 때마다 새로 메모리를 할당해주면 같은 값인데 쓸데없이 메모리가 중복되어 사용되니, 상수는 한번 선언해둔 메모리를 참조해서 사용할 수 있도록 static으로 선언


    //사칙 연산 계산 메서드
    public double calculate(int firstNum, int secondNum, char opterator) throws ArithmeticException{
        double result = 0.0;

        switch (opterator){
            case '+' : result = firstNum + secondNum;
            break;
            case '-' : result = firstNum - secondNum;
            break;
            case '*' : result = firstNum * secondNum;
            break;
            case '/' :
                if(secondNum == 0){
                    throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }else{
                    result = (double)firstNum / secondNum;
                }
                break;
            default:
                throw new ArithmeticException("올바른 연산자를 입력해주세요 (사칙연산 연산자 : +, -, *, /)");
        }

        return result;
    }

    //원의 넓이 계산 메서드
    public double calculateCircleArea(double radius){
        double result = radius * radius * PI;
        return result;
    }

    //값 저장하기
    public abstract void Setter(double result);
    //값 가져오기
    public abstract ArrayList<Double> Getter();
    //값 지우기
    public abstract void removeResult();
    //값 조회하기
    public abstract void inquiryResults();

}
