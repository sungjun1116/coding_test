package level2.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson42746Other {

    public String solution(int[] numbers) {
        List<String> arr = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());

        arr.sort((str1, str2) -> (str2 + str1).compareTo(str1 + str2));

        return arr.get(0).equals("0") ? "0": String.join("", arr);
    }

}
