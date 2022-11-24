package homework;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static ArrayList<Integer> multiplyOddNumber(List<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                result.add(number * 2);
            }
        }
        return result;
    }
}
