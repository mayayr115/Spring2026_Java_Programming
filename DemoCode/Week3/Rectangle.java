package DemoCode.Week3;

public class Rectangle {

    public double width;
    public double height;
    public double area;

    public void calculateArea(){
        this.area = this.width * this.height;
    }


    public void displayInfo(){
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
        System.out.println("Area: " + this.area);

    }



}
