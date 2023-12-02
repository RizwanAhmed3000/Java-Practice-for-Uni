public class CircleWithPrivateData {
    private double radius = 1;
    private static int numberOfObj = 0;

    public CircleWithPrivateData() {
        numberOfObj++;
    }

    public CircleWithPrivateData(double newRadius) {
        radius = newRadius;
        numberOfObj++;
    }

    public double getRadius() {
        return radius;
    }

    public static int getNumberOfObj() {
        return numberOfObj;
    }

    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

}
