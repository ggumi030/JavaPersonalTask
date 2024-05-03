package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class stream {

    public static void main(String[] args) {
        long[] answer = new long[5];
        List<Long> answers = new ArrayList<Long>();

         answer = LongStream
                 .iterate(10, num-> num+10)
                 .limit(5)
//                 .boxed()
//                 .mapToObj(i->i)   ++ toList();
                 .toArray();


         Integer num1 = 10;
         Integer num2 = 10;

         Integer result = num1.intValue() + num2.intValue();
    }
}
