package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number> extends Calculator {

    //생성자
    public ArithmeticCalculator(){
        super.arrList = new ArrayList<>();
    }

    //사칙 연산 계산 메서드
    public double calculate( T firstNum, T secondNum, char operator) throws ArithmeticException{
        return operatorSetter(operator).operate(firstNum,secondNum);
    }

    //사칙 연산 설정 메서드
    public Operator<T> operatorSetter(char operator){
        OperatorType operatorType = OperatorType.getOperatorType(operator);
        return switch(operatorType){
            case PLUS ->  new AddOperator<>();
            case MINUS ->  new SubtractOperator<>();
            case MULTIPLY ->  new MultiplyOperator<>();
            case DIVIDE ->  new DivideOperator<>();
            case MODULO ->  new ModOperator<>();
        };

    }

    public void setter(double result){
        super.arrList.add(result);
    }

    public ArrayList<Double> getter(){
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

    //입력된 값보다 큰 결과 값 조회
    public void inquiryBigResults(int inputNum){
        System.out.print("입력 받은 값보다 더 큰 값은 : [ ");
        super.arrList.stream().filter(num -> num > inputNum).forEach(num -> System.out.print(num + " "));
        System.out.println("] 입니다.");
    }
}
