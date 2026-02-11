package DemoCode.Week3;

public class RectangleDriver {

    public static void main(String[] args){

        Rectangle box = new Rectangle();
        box.height = 5;
        box.width = 6;
        box.calculateArea();
        box.width = 4;
        box.displayInfo(); // inconsistent data: area: 30.0 while Width: 4.0 and Height: 5.0

        RectangleTwo box2 = new RectangleTwo();
        box2.setWidth(6);
        box2.setHeight(-7);
        box2.calculateArea();
        box2.displayInfo();

    }
}
