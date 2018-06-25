public class ShapeCalculator extends LineCalc implements Calc2D,Calc3D {
    @Override
    public double circleArea(Circle circle) {
        return 3.14 * Math.pow(circle.getRadius(),2);
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getSideA() * rectangle.getSideB();
    }

    @Override
    public double ballVolume(Ball ball) {
        return (4/3)*3.14*Math.pow(ball.getRadius(),3);
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getSideA(),3);
    }

    @Override
    public double lineLength(Line2D line) {
        return super.lineLength(line);
    }
}
