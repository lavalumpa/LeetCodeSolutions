package topinterviewquestions.easy.arrays;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int first = 0;
        int second = matrix.length-1;
        int temp;
        while (first < second) {
            for (int i = first; i < second ; i++) {
                temp = matrix[first][i];
                matrix[first][i] = matrix[second-i+first][first];
                matrix[second-i+first][first] = matrix[second][second-i+first];
                matrix[second][second-i+first]=matrix[i][second];
                matrix[i][second]=temp;
            }
            first++;
            second--;
        }
    }
}
