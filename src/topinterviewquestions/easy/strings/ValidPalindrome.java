package topinterviewquestions.easy.strings;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder letters=new StringBuilder();
        for (int i=0; i<s.length();i++){
            if (Character.isLetterOrDigit(s.charAt(i))){
                letters.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        for (int i=0,j=letters.length()-1; j>i;j--,i++){
            if (letters.charAt(i)!=letters.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
