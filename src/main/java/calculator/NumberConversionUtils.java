package calculator;

public class NumberConversionUtils {
    public static <T extends Number> T convertNumberType(Number result, Class<T> type){
        if(type.equals(Integer.class)){
            return (T) Integer.valueOf(result.intValue());
        } else if(type.equals(Long.class)){
            return (T) Long.valueOf(result.longValue());
        } else if(type.equals(Double.class)){
            return (T) Double.valueOf(result.doubleValue());
        } else {
            throw new IllegalArgumentException("지원하지 않는 타입입니다. " + type);
        }
    }
}
