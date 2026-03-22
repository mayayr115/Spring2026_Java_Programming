package Lab.Lab07;

public class FindTheSums {
  public static String arrayToString(int[][] a) {
    String arr = "";
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (j != a[i].length - 1) arr += a[i][j] + " ";
        else arr += a[i][j];
      }
      if (i != a.length - 1) arr += "\n";
    }
    return arr;
  }

  public static int[][] horizontalSums(int[][] a, int sumToFind) {
    int[][] b = new int[a.length][a[0].length];
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        sum += a[i][j];
        if (sum == sumToFind) b[i][j] = a[i][j];
        else b[i][j] = 0;
      }
    }
    return b;
  }

  public static int[][] verticalSums(int[][] a, int sumToFind) {
    return a;
  }
}
