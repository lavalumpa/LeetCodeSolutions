package topinterviewquestions.easy.strings;

public class ReverseInteger {
    public int reverse(int x) {
        int result=0;
        int temp=0;
        while (x!=0){
            temp=x%10;
            if (result > Integer.MAX_VALUE/10 ||
                    (result==Integer.MAX_VALUE/10 && Integer.MAX_VALUE %10 <temp)) return 0;
            if (result<Integer.MIN_VALUE/10 ||
                    result==Integer.MIN_VALUE/10 && Integer.MIN_VALUE%10>temp) return 0;
            result=result*10+temp;
            x=x / 10;
        }
        return result;
    }
}
