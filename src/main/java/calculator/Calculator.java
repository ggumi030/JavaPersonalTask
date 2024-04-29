package calculator;

import java.util.ArrayList;
import java.lang.Math;

public class Calculator {
    //사칙 연산 컬렉션
    private ArrayList<Double> arrList;
    //원의 넓이 컬렉션
    private ArrayList<Double> circleList = new ArrayList<>();
    //파이 값
    public static final double PI = Math.PI;
    //파이 값은 변하지 않는 상수이기 때문에 final로 선언
    //객체 생성할 때마다 새로 메모리를 할당해주면 같은 값인데 쓸데없이 메모리가 중복되어 사용되니, 상수는 한번 선언해둔 메모리를 참조해서 사용할 수 있도록 static으로 선언


    //생성자
    public Calculator(){
        arrList = new ArrayList<>();
        circleList = new ArrayList<>();
    }


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

    public void arithmeticSetter(double result){
        arrList.add(result);
    }

    public ArrayList<Double> arithmeticGetter(){
        return arrList;
    }

    public void arithmeticRemoveResult(){
        arrList.removeFirst();
    }

    public void arithmeticInquiryResults(){
        System.out.print("[ ");
        for(Double num : arrList){
            System.out.print(num + " ");
        }
        System.out.println("]");
    }


    //원의 넓이 계산 메서드
    public double calculateCircleArea(double radius){
        double result = radius * radius * PI;
        return result;
    }

    public ArrayList<Double> circleGetter(){
        return circleList;
    }

    public void circleSetter(double result){
        circleList.add(result);
    }

    public void circleRemoveResult(){
        circleList.removeFirst();
    }

    public void circleInquiryResults(){
        System.out.print("[ ");
        for(Double num : circleList){
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
}
