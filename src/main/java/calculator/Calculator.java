package calculator;

import java.util.ArrayList;
import java.lang.Math;

public abstract class Calculator {
    //연산 컬렉션
    protected ArrayList<Double> arrList;
    //파이 값
    public static final double PI = Math.PI;
    //파이 값은 변하지 않는 상수이기 때문에 final로 선언
    //객체 생성할 때마다 새로 메모리를 할당해주면 같은 값인데 쓸데없이 메모리가 중복되어 사용되니, 상수는 한번 선언해둔 메모리를 참조해서 사용할 수 있도록 static으로 선언

    //값 저장하기
    public abstract void setter(double result);
    //값 가져오기
    public abstract ArrayList<Double> getter();
    //값 지우기
    public abstract void removeResult();
    //값 조회하기
    public abstract void inquiryResults();

}
