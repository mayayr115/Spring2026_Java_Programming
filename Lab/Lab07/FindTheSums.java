package Lab.Lab07;

public class FindTheSums {
  public static String arrayToString(int[][] a) {
    String arr = "";
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        arr += a[i][j];
        if (j != a[i].length - 1) arr += " ";
      }
      if (i != a.length - 1) arr += "\n";
    }
    return arr;
  }

  public static int[][] horizontalSums(int[][] a, int sumToFind) {
    int[][] b = new int[a.length][a[0].length];
    // Loop to iterate through matrix row
    for (int i = 0; i < a.length; i++) {
      // Loop to iterate through the current row
      for (int j = 0; j < a[i].length; j++) {
        int sum = 0;
        // Loop to add current element of current row to sum
        for (int k = j; k < a[i].length; k++) {
          sum += a[i][k];
          // If sum is equal to sumToFind, we will add all of the values from the indices [j, k] to array b
          if (sum == sumToFind) {
            for (int l = j; l <= k; l++) {
              b[i][l] = a[i][l];
            }
          }
        }
      }
    }
    return b;
  }

  public static int[][] verticalSums(int[][] a, int sumToFind) {
    int[][] b = new int[a.length][a[0].length];
    // Loop to iterate through matrix column
    for (int i = 0; i < a[0].length; i++) {
      // Loop to iterate through the current column
      for (int j = 0; j < a.length; j++) {
        int sum = 0;
        // Loop to add current element of current column to sum
        for (int k = j; k < a.length; k++) {
          sum += a[k][i];
          // If sum is equal to sumToFind, we will add all of the values from the indices [j, k][i] to array b
          if (sum == sumToFind) {
            for (int l = j; l <= k; l++) {
              b[l][i] = a[l][i];
            }
          }
        }
      }
    }
    return b;
  }
}
