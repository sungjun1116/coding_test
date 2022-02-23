package level3.bfs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Lesson43162Test {

    @DisplayName("네트워크 테스트")
    @ParameterizedTest
    @MethodSource("provideArguments")
    void test(int n, int[][] computers, int expected) {
        Lesson43162 lesson = new Lesson43162();

        int actual = lesson.solution(n, computers);

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> provideArguments() { // argument source method
        return Stream.of(
                Arguments.of(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}, 2),
                Arguments.of(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}, 1)
        );
    }

}