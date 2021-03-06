package topinterviewquestions.easy.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        if (s.length()==0) return -1;
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0; i<s.length();i++){
            map.merge(s.charAt(i), 1, (h1,h2)->h2+1);
        }
        for (int i=0; i<s.length();i++ ){
            if (map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
