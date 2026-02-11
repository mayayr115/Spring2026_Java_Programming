package DemoCode.Week3;

public class RectangleTwo {

    private double width;
    private double height;
    private double area;

    public void calculateArea(){
        this.area = this.width * this.height;
    }

    public void setWidth(double width){
        if(width >0){
            this.width = width;
        }else{
            System.out.println("Error: Rectangle sides can not be negative");
            System.exit(0);

        }
    }

    public void setHeight(double height){
        if(height >0){
            this.height = height;
        }else{
            System.out.println("Error: Rectangle sides can not be negative");
            System.exit(0);

        }
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return area;
    }

    public void displayInfo(){
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
        System.out.println("Area: " + this.area);

    }

}
