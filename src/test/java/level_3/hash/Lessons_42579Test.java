package level_3.hash;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Lessons_42579Test {

    private static Lessons_42579 lesson;

    @BeforeEach
    public void setup() {
        lesson = new Lessons_42579();
    }

    @Test
    void test() {
        String[] genres = new String[]{"classic", "pop", "classic", "classic", "pop"};
        int[] plays = new int[]{500, 600, 150, 800, 2500};

        int[] solution = lesson.solution(genres, plays);

        Assertions.assertThat(solution).isEqualTo(new int[]{4, 1, 3, 0});
    }

}