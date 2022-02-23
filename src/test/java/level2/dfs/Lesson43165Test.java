package level2.dfs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Lesson43165Test {

    @DisplayName("타겟 넘버 테스트")
    @ParameterizedTest
    @MethodSource("provideArguments")
    void test(int numbers[], int target, int expected) {
        Lesson43165 lesson = new Lesson43165();

        int actual = lesson.solution(numbers, target);

        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> provideArguments() { // argument source method
        return Stream.of(
                Arguments.of(new int[]{1, 1, 1, 1, 1}, 3, 5),
                Arguments.of(new int[]{4, 1, 2, 1}, 4, 2)
        );
    }

}