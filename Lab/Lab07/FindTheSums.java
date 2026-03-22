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

    // Loop to iterate through matrix
    for (int i = 0; i < a.length; i++) {
      // Loop to iterate through the current array
      for (int j = 0; j < a[i].length; j++) {
        int sum = 0;
        // Loop to add current element of current array to sum
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
    return a;
  }
}
