package Lab;

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
}
