package topinterviewquestions.easy.strings;

public class CountAndSay {
    public String countAndSay(int n) {
        if (n==1){
            return "1";
        }
        String cur=countAndSay(n-1);
        char prev=cur.charAt(0);
        int count=1;
        StringBuilder res=new StringBuilder();
        for (int i=1; i<cur.length();i++){
            if (prev!= cur.charAt(i)){
                res.append(count).append(prev);
                prev=cur.charAt(i);
                count=1;
            } else{
                count ++;
            }
        }
        res.append(count).append(prev);
        return res.toString();
    }
}
