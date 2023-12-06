public class App {
    static void myStaticClass() {
        System.out.println("this is static method" + "==>> static class");
    }

    public void myPublicMethod() {
        System.out.println("this is a public method" + "==>> public class");
    }

    public static void increment(Count c, int times) {
        c.count++;
        times++;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void swap2(int[] a) {
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Tv Tv1;
        // Tv1 = new Tv();
        // Tv1.print();
        // System.out.println(Tv1.x);
        // System.out.println(Tv1.s);
        // System.out.println(Tv1);
        // Tv1.turnOn();
        // Tv1.setChannel(21);
        // Tv1.setVol(30);
        // myStaticClass();
        // App class1 = new App();
        // class1.myPublicMethod();
        // System.out.println("Tv1 channel is " + Tv1.channel + " and volume is " +
        // Tv1.volume);

        // CircleWithPrivateData C1 = new CircleWithPrivateData(6);
        // System.out.println("the new radius of circle is: " + C1.getRadius() + " and
        // number of object is: "
        // + CircleWithPrivateData.getNumberOfObj());

        // CircleWithPrivateData C2 = new CircleWithPrivateData();
        // System.out.println("the new radius of circle is: " + C2.getRadius() + " and
        // number of object is: "
        // + CircleWithPrivateData.getNumberOfObj());

        // CircleWithPrivateData C3 = new CircleWithPrivateData(15);
        // C3.setRadius(C3.getRadius() * 1.1);
        // System.out.println("the new radius of circle is: " + C3.getRadius() + " and
        // number of object is: "
        // + CircleWithPrivateData.getNumberOfObj());

        // C3.printCircle(C1, 5);

        // -------------------------------xxxxxxxxxxxxxxxxxxxxxxxxxxxxx------------------------//

        // Count myCount = new Count();
        // int time = 0;

        // for(int i = 0; i < 100; i++){
        // increment(myCount, time);
        // }

        // System.out.println("Count is: " + myCount.count);
        // System.out.println("time is: " + time);

        int[] arry = { 2, 3 };
        System.out.println("Arry before: " + arry[0] + " , " + arry[1]);
        // swap(arry[0], arry[1]);
        // swap2(arry);

        System.out.println("arry[0] = " + arry[0]);
        System.out.println("arry[1] = " + arry[1]);
    }
}
