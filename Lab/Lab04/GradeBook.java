package Lab.Lab04;

// Maya Ramkishun
// 2/27/26
/* The program takes an input of an array of either type double, float, int or long values,
and allows you to find the minimum and maximum values, and compute the average and mode of the array.*/

public class GradeBook {
  private double[] grades;

  // Default constructor
  public GradeBook() {
    this.grades = new double[0];
  }

  // Copy constructor
  public GradeBook(GradeBook otherGradeBook) {
    setGrades(otherGradeBook.grades);
  }

  // Constructor with double array
  public GradeBook(double[] newGrades) {
    setGrades(newGrades);
  }

  // Constructor with float array
  public GradeBook(float[] newGrades) {
    setGrades(newGrades);
  }

  // Constructor with int array
  public GradeBook(int[] newGrades) {
    setGrades(newGrades);
  }

  // Constructor with long array
  public GradeBook(long[] newGrades) {
    setGrades(newGrades);
  }

  // All setGrades methods iterate through the given array, and appends then to the grades array regardless of type
  // Widening Conversion is happening here. Automatic conversion because the types being converted are smaller than type type they're being converted to.
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

  // The Java toString() method doesn't work on arrays
  public String toString() {
    String result = "[";

    for (int i = 0; i < grades.length; i++) {
      result += grades[i];

      // Adds a space after every element, except the last one
      if (i < grades.length - 1) result += " ";
    }
    return result + "]";
  }

  public double minGrade() {
    if (grades.length == 0) return Double.NaN;  // nothing to return
    double min = grades[0]; // Initialize to first element of the array
    for (int i = 1; i < grades.length; i++) {
      if (grades[i] < min) min = grades[i];
    }
    return min;
  }

  public double maxGrade() {
    if (grades.length == 0) return Double.NaN;  // nothing to return
    double max = grades[0]; // Initialize to first element of the array
    for (int i = 1; i < grades.length; i++) {
      if (grades[i] > max) max = grades[i];
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

      // Pointer Loop for array to count how many times a certain element was present in the array
      for (int j = 0; j < grades.length; j++) {
        if (grades[j] == grades[i]) count++;
      }

      if (count > maxCount) {
        maxCount = count;
        mode = grades[i];
      }
    }
    // if every number was counted in the array once
    if (maxCount == 1) return Double.NaN;
    return mode;
  }
}
