package calculator;

import java.util.Objects;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        //사칙연산 클래스 선언
        ArithmeticCalculator<Double> arithCalc = new ArithmeticCalculator<>(Double.class);
        //원 넓이 연산 클래스 선언
        Calculator circleCalc = new CircleCalculator();


        while(true){
            //연산 선택
            System.out.println("원하는 연산을 선택해주세요. (arithmetic, circle)");
            String selection = sc.nextLine();
            //사칙연산
            if(Objects.equals(selection,"arithmetic")){

                System.out.print("첫 번째 숫자를 입력하세요: ");
                double firstNum = sc.nextDouble();
                System.out.print("두 번째 숫자를 입력하세요: ");
                double secondNum = sc.nextDouble();
                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);

                double arithmeticResult = 0;

                arithmeticResult = arithCalc.calculate(firstNum,secondNum,operator);
                arithCalc.setter(arithmeticResult);
                System.out.println("결과: " + arithmeticResult);

                //값 제거
                sc.nextLine(); //입력된 \n값 제거
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String remove = sc.nextLine();

                if(remove.equals("remove")){
                    arithCalc.removeResult();
                }

                //값 조회
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquiry = sc.nextLine();
                if(inquiry.equals("inquiry")){
                    arithCalc.inquiryResults();
                }

                //더 큰 결과 값 출력
                System.out.println("값을 입력해주세요. (더 큰 결과값 조회)");
                int inputNum = sc.nextInt();
                arithCalc.inquiryBigResults(inputNum);
                sc.nextLine(); //입력된 \n값 제거


                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                String re = sc.nextLine();
                if(re.equals("exit")){
                    break;
                }
            }

            //원 넓이 구하기
            if(Objects.equals(selection,"circle")){
                System.out.print("반지름의 길이를 입력하세요: ");
                double circleRadius = sc.nextDouble();
                double circleResult;

                //연산위한 형변환
                CircleCalculator circlecalculator = (CircleCalculator) circleCalc;

                //연산
                circleResult =circlecalculator.calculateCircleArea(circleRadius);
                //결과 출력
                System.out.println("결과: " + circleResult);

                //넓이 저장
                circleCalc.setter(circleResult);

                //값 제거
                sc.nextLine(); //입력된 \n값 제거
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                if(Objects.equals("remove",sc.nextLine())){
                    circleCalc.removeResult();
                }

                //값 조회
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                if(Objects.equals(sc.nextLine(),"inquiry")){
                    circleCalc.inquiryResults();
                }

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                if(Objects.equals("exit",sc.nextLine())){
                    break;
                }
            }


        }


    }
}
