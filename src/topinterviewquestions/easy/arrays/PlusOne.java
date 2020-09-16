package topinterviewquestions.easy.arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int count=digits.length-1;
        while (count>=0 && digits[count]==9){
            count--;
        }
        if (count<0){
            int []results= new int [digits.length+1];
            results[0]=1;
            for (int i=0; i<digits.length;i++){
                results[i+1]=0;
            }
            digits=results;
        } else {
            digits[count]+=1;
            for (int i=count+1; i<digits.length;i++){
                digits[i]=0;
            }
        }
        return digits;
    }
}
