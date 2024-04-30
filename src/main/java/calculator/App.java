package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        //사칙연산 클래스 선언
        ArithmeticCalculator arithCalc;
        //사칙연산 인터페이스 선언
        Operator add = new AddOperator();
        Operator subtract = new SubtractOperator();
        Operator multiply = new MultiplyOperator();
        Operator divide = new DivideOperator();
        Operator mod = new ModOperator();

        //원 넓이 연산 클래스 선언
        Calculator circleCalc = new CircleCalculator();

        while(true){
            //연산 선택
            System.out.println("원하는 연산을 선택해주세요. (arithmetic, circle)");
            String selection = sc.nextLine();
            //사칙연산
            if(selection.equals("arithmetic")){

                System.out.print("첫 번째 숫자를 입력하세요: ");
                int firstNum = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                int secondNum = sc.nextInt();
                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);

                double arithmeticResult = 0;

                switch (operator){
                    case '+':
                        arithCalc = new ArithmeticCalculator(add);
                        arithmeticResult = arithCalc.calculate(firstNum,secondNum);
                        arithCalc.Setter(arithmeticResult);
                        break;
                    case '-':
                        arithCalc = new ArithmeticCalculator(subtract);
                        arithmeticResult = arithCalc.calculate(firstNum,secondNum);
                        arithCalc.Setter(arithmeticResult);
                        break;
                    case '*':
                        arithCalc = new ArithmeticCalculator(multiply);
                        arithmeticResult = arithCalc.calculate(firstNum,secondNum);
                        arithCalc.Setter(arithmeticResult);
                        break;
                    case '/':
                        arithCalc = new ArithmeticCalculator(divide);
                        arithmeticResult = arithCalc.calculate(firstNum,secondNum);
                        arithCalc.Setter(arithmeticResult);
                        break;
                    case '%':
                        arithCalc = new ArithmeticCalculator(mod);
                        arithmeticResult = arithCalc.calculate(firstNum,secondNum);
                        arithCalc.Setter(arithmeticResult);
                        break;
                    default:
                        throw new ArithmeticException("올바른 연산자를 입력해주세요 (사칙연산 연산자 : +, -, *, /, %)");
                }

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

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                String re = sc.nextLine();
                if(re.equals("exit")){
                    break;
                }
            }

            //원 넓이 구하기
            if(selection.equals("circle")){
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
                circleCalc.Setter(circleResult);

                //값 제거
                sc.nextLine(); //입력된 \n값 제거
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String remove = sc.nextLine();

                if(remove.equals("remove")){
                    circleCalc.removeResult();
                }

                //값 조회
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquiry = sc.nextLine();
                if(inquiry.equals("inquiry")){
                    circleCalc.inquiryResults();
                }

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                String re = sc.nextLine();
                if(re.equals("exit")){
                    break;
                }
            }


        }


    }
}
