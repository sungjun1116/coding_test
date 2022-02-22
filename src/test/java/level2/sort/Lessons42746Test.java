package level2.sort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Lessons42746Test {

    @DisplayName("가장 큰 수 테스트")
    @ParameterizedTest
    @MethodSource("provideArguments")
    void test(int[] numbers, String expected) {
        Lessons42746 lesson = new Lessons42746();

        String solution = lesson.solution(numbers);

        assertThat(solution).isEqualTo(expected);
    }

    private static Stream<Arguments> provideArguments() { // argument source method
        return Stream.of(
                Arguments.of(new int[]{6, 10, 2}, "6210"),
                Arguments.of(new int[]{3, 30, 34, 5, 9}, "9534330"),
                Arguments.of(new int[]{0, 0, 0}, "0")
        );
    }

}