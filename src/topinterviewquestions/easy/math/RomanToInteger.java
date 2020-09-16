package topinterviewquestions.easy.math;

public class RomanToInteger {
    public int romanToInt(String s) {
        int result=0;
        int previous=0;
        for (int i=0; i<s.length();i++){
            if (s.charAt(i)=='M') {
                result+=1000;
                if (previous==100) result-=200;
            }
            if (s.charAt(i)=='D') {
                result+=500;
                if (previous==100) result-=200;
            }
            if (s.charAt(i)=='C') {
                result+=100;
                if (previous==10) result-=20;
                previous=100;
            }
            if (s.charAt(i)=='L') {
                result+=50;
                if (previous==10) result-=20;
            }
            if (s.charAt(i)=='X') {
                result+=10;
                if (previous==1)  result-=2;
                previous=10;
            }
            if (s.charAt(i)=='V') {
                result+=5;
                if (previous==1)result-=2;
            }
            if (s.charAt(i)=='I') {
                result+=1;
                previous=1;
            }
        }
        return result;
    }
}
