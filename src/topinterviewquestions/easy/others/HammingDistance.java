package topinterviewquestions.easy.others;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int counter=0;
        int xor=x^y;
        for (int i=0; i<32;i++){
            counter += (xor & 1);
            xor>>=1;
        }
        return counter;
    }
}
