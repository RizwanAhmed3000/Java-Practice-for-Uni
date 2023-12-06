public class CircleWithPrivateData {
    private double radius = 1;
    private static int numberOfObj = 0;
    final static double PI = 3.14159265358979323846;

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

    public double getArea() {
        return radius * radius * PI;
    }

    public void printCircle(CircleWithPrivateData c, int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }

    
}
