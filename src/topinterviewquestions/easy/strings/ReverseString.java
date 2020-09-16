package topinterviewquestions.easy.strings;

public class ReverseString {
    public void reverseString(char[] s) {
        char temp;
        int n = s.length - 1;
        int top = s.length / 2;
        for (int i = 0; i < top; i++) {
            temp = s[i];
            s[i] = s[n - i];
            s[n - i] = temp;
        }
    }
}
