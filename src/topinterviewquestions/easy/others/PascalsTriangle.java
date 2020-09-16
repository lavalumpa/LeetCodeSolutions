package topinterviewquestions.easy.others;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> last=new ArrayList<>();
        for (int i =0; i<numRows; i++){
            List<Integer> current=new ArrayList<>();
            for (int j=0; j<=i; j++){
                if (j==0 || j==i) {
                    current.add(1);
                } else {
                    current.add(last.get(j)+last.get(j-1));
                }
            }
            last=current;
            result.add(current);
        }
        return result;
    }
}
