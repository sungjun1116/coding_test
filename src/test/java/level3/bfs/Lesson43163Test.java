package level3.bfs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Lesson43163Test {

    @DisplayName("단어 변환 테스트")
    @ParameterizedTest
    @MethodSource("provideArguments")
    void test(String begin, String target, String[] words, int expected) {
        Lesson43163 lesson = new Lesson43163();

        int actual = lesson.solution(begin, target, words);

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> provideArguments() { // argument source method
        return Stream.of(
                Arguments.of("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"}, 4),
                Arguments.of("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"}, 0)
        );
    }
}
