package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    //생성자
    public ArithmeticCalculator(){
        super.arrList = new ArrayList<>();
        super.addoperator = new AddOperator();
        super.suboperator = new SubtractOperator();
        super.divideoperator = new DivideOperator();
        super.multiplyoperator = new MultiplyOperator();
    }

    //사칙 연산 계산 메서드
    public double calculate(int firstNum, int secondNum, char opterator) throws ArithmeticException{
        double result = 0.0;

        switch (opterator){
            case '+' : result = super.addoperator.operate(firstNum, secondNum); break;
            case '-' : result = super.suboperator.operate(firstNum, secondNum); break;
            case '*' : result = super.multiplyoperator.operate(firstNum, secondNum); break;
            case '/' :
                if(secondNum == 0){
                    throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }else{
                    result = super.divideoperator.operate(firstNum, secondNum);
                }
                break;
            default:
                throw new ArithmeticException("올바른 연산자를 입력해주세요 (사칙연산 연산자 : +, -, *, /)");
        }

        return result;
    }

    public void Setter(double result){
        super.arrList.add(result);
    }

    public ArrayList<Double> Getter(){
        return super.arrList;
    }

    public void removeResult(){
        super.arrList.removeFirst();
    }

    public void inquiryResults(){
        System.out.print("[ ");
        for(Double num : super.arrList){
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
}
