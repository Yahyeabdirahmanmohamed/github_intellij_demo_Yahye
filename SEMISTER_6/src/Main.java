public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 5);


        circle.displayShapeType();
        System.out.println("Circle Area: " + circle.calculateArea());

        rectangle.displayShapeType();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}