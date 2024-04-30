package calculator;

public enum OperatorType {
    //연산자 타입 정보
    PLUS{
        @Override
        public double apply(double firstNum, double secondNum) {
            return firstNum + secondNum;
        }
    }, MINUS{
        public double apply(double firstNum, double secondNum) {
            return firstNum - secondNum;
        }

    }, MULTIPLY{
        public double apply(double firstNum, double secondNum) {
            return firstNum * secondNum;
        }

    }, DIVIDE{
        public double apply(double firstNum, double secondNum) throws ArithmeticException {
            if(secondNum == 0){
                throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }else{
                return firstNum / secondNum;
            }
        }

    }, REMAINDER{
        public double apply(double firstNum, double secondNum) {
            return firstNum % secondNum;
        }
    };

    //enum 객체 추상 메소드
    public abstract double apply(double firstNum, double secondNum) throws ArithmeticException;
}
