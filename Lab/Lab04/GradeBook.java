package Lab.Lab04;

public class GradeBook {
  private double[] grades;

  public GradeBook() {
    this.grades = new double[0];
  }

  public GradeBook(GradeBook otherGradeBook) {
    this.grades = new double[otherGradeBook.grades.length];
    for (int i = 0; i < otherGradeBook.grades.length; i++) {
      this.grades[i] = otherGradeBook.grades[i];
    }
  }

  public GradeBook(double[] newGrades) {
    setGrades(newGrades);
  }

  public GradeBook(float[] newGrades) {
    setGrades(newGrades);
  }

  public GradeBook(int[] newGrades) {
    setGrades(newGrades);
  }

  public GradeBook(long[] newGrades) {
    setGrades(newGrades);
  }

  public void setGrades(float[] newGrades) {
    this.grades = new double[newGrades.length];
    for (int i = 0; i < newGrades.length; i++) {
      this.grades[i] = newGrades[i];
    }
  }

  public void setGrades(double[] newGrades) {
    this.grades = new double[newGrades.length];
    for (int i = 0; i < newGrades.length; i++) {
      this.grades[i] = newGrades[i];
    }
  }

  public void setGrades(int[] newGrades) {
    this.grades = new double[newGrades.length];
    for (int i = 0; i < newGrades.length; i++) {
      this.grades[i] = newGrades[i];
    }
  }

  public void setGrades(long[] newGrades) {
    this.grades = new double[newGrades.length];
    for (int i = 0; i < newGrades.length; i++) {
      this.grades[i] = newGrades[i];
    }
  }

  public double[] getGrades() {
    return grades;
  }

  public boolean isEmpty() {
    return grades.length <= 0;
  }

  public String toString() {
    String result = "[";

    for (int i = 0; i < grades.length; i++) {
      result += grades[i];

      if (i < grades.length - 1) {
        result += " ";
      }
    }
    return result + "]";
  }

  public double minGrade() {
    if (grades.length == 0) return Double.NaN;  // nothing to return
    double min = grades[0];
    for (int i = 1; i < grades.length; i++) {
      if (grades[i] < min) {
        min = grades[i];
      }
    }
    return min;
  }

  public double maxGrade() {
    if (grades.length == 0) return Double.NaN;  // nothing to return
    double max = grades[0];
    for (int i = 1; i < grades.length; i++) {
      if (grades[i] > max) {
        max = grades[i];
      }
    }
    return max;
  }

  public double averageGrade() {
    if (grades.length == 0) return Double.NaN;  // nothing to return
    double total = 0.0;
    for (int i = 0; i < grades.length; i++) {
      total += grades[i];
    }
    return total / grades.length;
  }

  public double modeGrade() {
    if (grades.length == 0) return Double.NaN;  // nothing to return
    double mode = grades[0];
    int maxCount = 0;

    // Iterate through array
    for (int i = 0; i < grades.length; i++) {
      int count = 0;

      // Pointer Loop for array
      for (int j = 0; j < grades.length; j++) {
        if (grades[j] == grades[i]) count++;
      }

      if (count > maxCount) {
        maxCount = count;
        mode = grades[i];
      }
    }
    if (maxCount == 1) return Double.NaN;
    return mode;
  }
}
