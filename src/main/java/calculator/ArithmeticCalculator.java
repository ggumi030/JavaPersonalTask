package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    //생성자
    public ArithmeticCalculator(){
        super.arrList = new ArrayList<>();
    }

    //사칙 연산 계산 메서드
    public double calculate(int firstNum, int secondNum) throws ArithmeticException{
        double result = super.operator.operate(firstNum,secondNum);
        return result;
    }

    //사칙 연산 설정 메서드
    public void operatorSetter(Operator operator){
        super.operator = operator;
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
