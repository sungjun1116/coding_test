package level3.bfs;

public class Lesson43163 {

    private int answer = 51;

    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        dfs(begin, target, words, visited, 0);
        return answer == 51 ? 0 : answer;
    }

    private void dfs(String begin, String target, String[] words, boolean[] visited, int cnt) {
        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && isFitToRule(begin, words[i])) {
                if (words[i].equals(target)) {
                    answer = Math.min(answer, cnt + 1);
                    return;
                }
                visited[i] = true;
                dfs(words[i], target, words, visited, cnt + 1);
                visited[i] = false;
            }
        }
    }

    private boolean isFitToRule(String str1, String str2) {
        int temp = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                temp += 1;
            }
        }
        if (temp == 1) {
            return true;
        }
        return false;
    }

}
