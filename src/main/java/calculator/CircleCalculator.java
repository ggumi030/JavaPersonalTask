package calculator;

import java.util.ArrayList;

public class CircleCalculator extends Calculator{
    //생성자
    public CircleCalculator(){
        super.circleList = new ArrayList<>();
    }

    //원의 넓이 계산 메서드
    public double calculateCircleArea(double radius){
        double result = radius * radius * PI;
        return result;
    }

    @Override
    public ArrayList<Double> getter(){
        return super.circleList;
    }

    public void setter(double result){
        super.circleList.add(result);
    }

    public void removeResult(){
        super.circleList.removeFirst();
    }

    public void inquiryResults(){
        System.out.print("[ ");
        for(Double num : super.circleList){
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
}
