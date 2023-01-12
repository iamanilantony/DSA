package Arrays;

import java.util.Arrays;

public class cells_with_odd_values_in_a_matrix {

  public static void main(String[] args) {
    int m = 2, n = 3;
    int[][] indices = { { 0, 1 }, { 1, 1 } };
    System.out.println(oddCells(m, n, indices));
    // oddCells(m, n, indices);
  }

  public static int oddCells(int m, int n, int[][] indices) {
    int[][] answer = new int[m][n];
    int count = 0;
    for (int i = 0; i < indices.length; i++) {
      //row
      for (int j = 0; j < n; j++) {
        answer[indices[i][0]][j]++;
      }
      //column
      for (int j = 0; j < m; j++) {
        answer[j][indices[i][1]]++;
      }
    }
    for (int i = 0; i < answer.length; i++) {
      for (int j = 0; j < answer[0].length; j++) {
        if (answer[i][j] % 2 != 0) count++;
      }
    }
    return count;
}
}
