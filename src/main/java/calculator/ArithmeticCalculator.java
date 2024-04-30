package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    //생성자
    public ArithmeticCalculator(Operator operator){
        super.arrList = new ArrayList<>();
        super.operator = operator;
    }

    //사칙 연산 계산 메서드
    public double calculate(int firstNum, int secondNum) throws ArithmeticException{
        double result = super.operator.operate(firstNum,secondNum);
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
