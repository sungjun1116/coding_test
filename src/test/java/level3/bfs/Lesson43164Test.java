package level3.bfs;

import level3.stack.Lesson43164;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Lesson43164Test {

    @ParameterizedTest
    @MethodSource("provideArguments")
    @DisplayName("여행경로 테스트")
    void test(String[][] tickets, String[] expected) {
        Lesson43164 lesson = new Lesson43164();

        String[] actual = lesson.solution(tickets);

        Assertions.assertThat(actual).isEqualTo(expected);

    }

    private static Stream<Arguments> provideArguments() { // argument source method
        return Stream.of(
                Arguments.of(new String[][]{{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}}, new String[]{"ICN", "JFK", "HND", "IAD"}),
                Arguments.of(new String[][]{{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}}, new String[]{"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"})
        );
    }

}