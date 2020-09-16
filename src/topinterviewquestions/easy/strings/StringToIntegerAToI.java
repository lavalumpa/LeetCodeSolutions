package topinterviewquestions.easy.strings;

public class StringToIntegerAToI {
    public int myAtoi(String str) {
        int res = 0;
        int i = 0;
        boolean negative = false;
        if (str.length() == 0) {
            return res;
        }
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        if (i < str.length() && (str.charAt(i) == '-' || str.charAt(i) == '+')) {
            if (str.charAt(i) == '-') {
                negative = true;
            }
            i++;
        }
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
                return !negative ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + (str.charAt(i++) - '0');
        }
        return res * (negative ? -1 : 1);
    }
}
