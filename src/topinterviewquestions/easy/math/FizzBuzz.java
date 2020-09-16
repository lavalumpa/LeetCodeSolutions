package topinterviewquestions.easy.math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder string = new StringBuilder();
            if (((i + 1) % 3) == 0) {
                string.append("Fizz");
            }
            if (((i + 1) % 5) == 0) {
                string.append("Buzz");
            }
            if (string.length() == 0) string.append(i + 1);
            result.add(new String(string));
        }
        return result;
    }
}
