package topinterviewquestions.easy.others;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int counter=0;
        while (n!=0){
            counter+=n & 1;
            n=n>>>1;
        }
        return counter;
    }
}
