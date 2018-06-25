public class ShapeTest {
    public static void main(String[] args) {
        Line2D line2D = new Line2D(3.4,7.4,5,6);
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(7,14);
        Ball ball = new Ball(9);
        Cube cube = new Cube(6.44);

        ShapeCalculator shapeCalculator = new ShapeCalculator();

        System.out.println("Długość odcinka: " + shapeCalculator.lineLength(line2D));
        System.out.println("Pole koła: " + shapeCalculator.circleArea(circle));
        System.out.println("Pole prostokata: " + shapeCalculator.rectangleArea(rectangle));
        System.out.println("Objętość kuli: " + shapeCalculator.ballVolume(ball));
        System.out.println("Objętość sześcianu: " + shapeCalculator.cubeVolume(cube));
    }
}
