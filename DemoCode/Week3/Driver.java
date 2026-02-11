package DemoCode.Week3;

public class Driver {

    public static void main(String[] args){

        Student s1 = new Student();
        Student s2 = new Student();

        s1.recordStudentInfo("Alex", 20, 3.5, "2028");
        s2.recordStudentInfo("Max", 20, 2.8, "2028");

        s2.displayStudentInfo();
        s1.displayStudentInfo();

    }
}
