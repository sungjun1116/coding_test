package level2.dfs;

public class Lesson43165 {

    private int answer;

    public int solution(int[] numbers, int target) {
        dfs(0, 0, numbers, target);
        return this.answer;
    }

    private void dfs(int value, int index, int[] numbers, int target) {
        if (index == numbers.length) {
            if (value == target) {
                this.answer++;
            }
            return;
        }

        dfs(value + numbers[index], index + 1, numbers, target);
        dfs(value - numbers[index], index + 1, numbers, target);
    }
}
