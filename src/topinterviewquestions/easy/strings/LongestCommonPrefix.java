package topinterviewquestions.easy.strings;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int length=shortestLength(strs);
        char current=' ';
        String result="";
        for (int i=0; i<length;i++){
            if (strs.length>0)current=strs[0].charAt(i);
            for (int j=1; j<strs.length;j++){
                if(current!=strs[j].charAt(i)) return result;
            }
            if (strs.length>0)result+=current;
        }
        return result;
    }


    public int shortestLength(String []strs){
        int length=99999;
        for (String s:strs){
            if (length>s.length()) length=s.length();
        }
        return length;
    }
}
