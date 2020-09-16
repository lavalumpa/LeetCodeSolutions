package topinterviewquestions.easy.strings;

public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if (needle.length()==0){
            return 0;
        }
        int index=-1;
        for (int i=0; i<haystack.length()-needle.length()+1;i++){
            if (haystack.charAt(i)==needle.charAt(0)){
                index=i;
                for (int j=1; j<needle.length();j++){
                    if (needle.charAt(j)!=haystack.charAt(i+j)){
                        index=-1;
                        break;
                    }
                }
                if (index>-1){
                    return index;
                }
            }
        }
        return index;
    }
}
