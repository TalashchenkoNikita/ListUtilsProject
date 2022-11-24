package homework;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {
    List<Integer> numbers = new ArrayList<>();

    @Test
    void shouldGetSum() {
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        assertThat(NumberUtils.getSum(numbers)).isEqualTo(10);
    }

    @Test
    void multiplyOddNumber() {
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        int[] result = {10, 6};
        assertThat(NumberUtils.multiplyOddNumber(numbers)).isEqualTo(Arrays.asList(result));
    }

}