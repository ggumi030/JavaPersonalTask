package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int resArr[] = new int[10]; //계산 결과를 저장할 배열
//        int arrIndex = 0; //배열의 마지막 인덱스를 저장할 변수
        ArrayList<Double> resList = new ArrayList<>(); //계산 결과를 저장할 리스트

        while(true){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNum = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            double result = 0;

            switch (operator){
                case '+': result = firstNum + secondNum; break;
                case '-': result = firstNum - secondNum; break;
                case '*': result = firstNum * secondNum; break;
                case '/':
                    if(secondNum == 0){
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    }else{
                        result = (double)firstNum / secondNum;
                    }
                    break;
            }

            System.out.println("결과: " + result);

            //level 1-6
//            if(arrIndex == 10){
//                for(int i = 0; i < resArr.length-1; i++){
//                    resArr[i] = resArr[i+1];
//                }
//                resArr[arrIndex-1] = result;
//                System.out.println(resArr[arrIndex-1]);
//            }else {
//                resArr[arrIndex] = result; //배열에 결과 값 저장
//                arrIndex++;  //인덱스 하나 증가
//            }

            //level 1-7
            //값 추가
            resList.add(result);

            //값 제거
            sc.nextLine(); //입력된 \n값 제거
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.nextLine();

            if(remove.equals("remove")){
                resList.remove(0);
            }

            //값 조회
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.nextLine();
            if(inquiry.equals("inquiry")){
                System.out.print("[ ");
                for(Double num : resList){
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
