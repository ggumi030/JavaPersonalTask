package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws ArithmeticException{
        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();

        while(true){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNum = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            double result = 0;

                switch (operator){
                    case '+':
                        result = calc.calculate(firstNum,secondNum,'+');
                        calc.Setter(result);
                        break;
                    case '-':
                        result = calc.calculate(firstNum,secondNum,'-');
                        calc.Setter(result);
                        break;
                    case '*':
                        result = calc.calculate(firstNum,secondNum,'*');
                        calc.Setter(result);
                        break;
                    case '/':
                        result = calc.calculate(firstNum,secondNum,'/');
                        calc.Setter(result);
                        break;
                    default:
                        result = calc.calculate(firstNum,secondNum,operator);
                }


            System.out.println("결과: " + result);


            //값 제거
            sc.nextLine(); //입력된 \n값 제거
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.nextLine();

            if(remove.equals("remove")){
                calc.removeResult();
            }

            //값 조회
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.nextLine();
            if(inquiry.equals("inquiry")){
                System.out.print("[ ");
                for(Double num : calc.getArrList()){
                    System.out.print(num + " ");
                }
                System.out.println("]");
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String re = sc.nextLine();
            if(re.equals("exit")){
                break;
            }
        }

    }
}
