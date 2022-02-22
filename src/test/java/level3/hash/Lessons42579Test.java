package level3.hash;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Lessons42579Test {

    @Test
    @DisplayName("베스트앨범 테스트")
    void test() {
        Lessons42579 lesson = new Lessons42579();
        String[] genres = new String[]{"classic", "pop", "classic", "classic", "pop"};
        int[] plays = new int[]{500, 600, 150, 800, 2500};

        int[] solution = lesson.solution(genres, plays);

        Assertions.assertThat(solution).isEqualTo(new int[]{4, 1, 3, 0});
    }

}