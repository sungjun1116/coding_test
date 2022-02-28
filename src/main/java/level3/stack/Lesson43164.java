package level3.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Lesson43164 {

    private Map<String, Stack<String>> routes = new HashMap<>();

    public String[] solution(String[][] tickets) {
        createRoutes(tickets);
        for (String key : routes.keySet()) {
            routes.get(key).sort(Comparator.reverseOrder());
        }

        Stack<String> stack = new Stack<>();
        stack.push("ICN");
        List<String> answer = new ArrayList<>();

        while (!stack.isEmpty()) {
            String peek = stack.peek();

            if (routes.containsKey(peek) && !routes.get(peek).isEmpty()) {
                stack.push(routes.get(peek).pop());
            } else {
                answer.add(stack.pop());
            }
        }

        Collections.reverse(answer);
        return answer.toArray(new String[answer.size()]);
    }

    private void createRoutes(String[][] tickets) {
        for (String[] ticket : tickets) {
            Stack<String> stack = new Stack<>();
            if (routes.containsKey(ticket[0])) {
                stack = routes.get(ticket[0]);
                stack.push(ticket[1]);
            } else {
                stack.push(ticket[1]);
            }
            routes.put(ticket[0], stack);
        }
    }
}
