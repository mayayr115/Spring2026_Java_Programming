package DemoCode.Week3;

// import java.util.Scanner;

public class Student {
    public String name;
    public int age;
    public double gpa;
    public String graduationYear;

    public void displayStudentInfo(){
        System.out.println("The student information is:");
        // "this" is optional since it doesn't resolve any ambiguities in here
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("GPA: " + this.gpa);
        System.out.println("The student is expected to graduate by " + graduationYear);
    }

    public void recordStudentInfo(String name, int age, double gpa, String graduationYear){
        /* "this" is required here to resolve the ambiguity between
        input params & instance variables that have the same names.
         */
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.graduationYear = graduationYear;
    }


    /*public void recordStudentInfo(){
        System.out.println("Enter Student Information...");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name:\t");
        this.name = scanner.nextLine();
        System.out.print("Age:\t");
        age = scanner.nextInt();
        System.out.print("GPA:\t");
        this.gpa = scanner.nextDouble();
        System.out.print("Graduation Year:\t");
        graduationYear = scanner.next();
    }*/






}
