package level3.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Lesson43162 {

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, computers, visited);
                answer++;
            }
        }

        return answer;
    }

    private void dfs(int i, int[][] computers, boolean[] visited) {
        visited[i] = true;
        for (int j = 0; j < computers.length; j++) {
            if (isConnect(visited, j, computers[i])) {
                dfs(j, computers, visited);
            }
        }
    }

    private void bfs(int i, int[][] computers, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        visited[i] = true;

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            for (int k = 0; k < computers.length; k++) {
                if (isConnect(visited, k, computers[currentNode])) {
                    queue.add(k);
                    visited[k] = true;
                }
            }
        }
    }

    private boolean isConnect(boolean[] visited, int node, int[] computers) {
        return !visited[node] && computers[node] == 1;
    }
}
