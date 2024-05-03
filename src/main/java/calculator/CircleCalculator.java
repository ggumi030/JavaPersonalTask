package calculator;

import java.util.ArrayList;

public class CircleCalculator extends Calculator{
    //생성자
    public CircleCalculator(){
        super.arrList = new ArrayList<>();
    }

    //원의 넓이 계산 메서드
    public double calculateCircleArea(double radius){
        double result = radius * radius * PI;
        return result;
    }

    @Override
    public ArrayList<Double> getter(){
        return super.arrList;
    }

    public void setter(double result){
        super.arrList.add(result);
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
