package Lab.Lab04;

public class GradeBook {
  private double[] grades;

  public GradeBook() {
    this.grades = new double[0];
  }

  public GradeBook(GradeBook otherGradeBook) {
    this.grades = new double[otherGradeBook.grades.length];
    for (int i = 0; i < grades.length; i++) {
      this.grades[i] = grades[i];
    }
  }

  public GradeBook(double[] newGrades) {

  }

  public GradeBook(float[] newGrades) {
    
  }

  public GradeBook(int[] newGrades) {
    
  }

  public GradeBook(long[] newGrades) {
    
  }

  public void setGrades(float[] newGrades) {
    
  }

  public void setGrades(double[] newGrades) {
    
  }

  public void setGrades(int[] newGrades) {
    
  }

  public void setGrades(long[] newGrades) {
    
  }

  public double[] getGrades() {
    return grades;
  }

  public boolean isEmpty() {
    return grades.length <= 0;
  }

  public String toString() {
    // String strGrades = (String) grades;
    // return strGrades;
    return " ";
  }

  public double minGrade() {
    return 0.0;
  }

  public double maxGrade() {
    return 0.0;
  }

  public double averageGrade() {
    return 0.0;
  }

  public double modeGrade() {
    return 0.0;
  }
}
