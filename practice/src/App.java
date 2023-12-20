import java.util.Scanner;

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

    private static int i = 0;
    private static int j = 0;

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

        // int[] arry = { 2, 3 };
        // System.out.println("Arry before: " + arry[0] + " , " + arry[1]);
        // swap(arry[0], arry[1]);
        // swap2(arry);

        // System.out.println("arry[0] = " + arry[0]);
        // System.out.println("arry[1] = " + arry[1]);

        // -----------------------------------xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx-------------------------//

        // int i = 2;
        // int k = 3;
        // {
        // int j = 3;
        // System.out.println("i + j is " + i + j);
        // }

        // k = i + j;
        // System.out.println("k is " + k);
        // System.out.println("j is " + j);

        // ============================CLASS ABSTRACTION &
        // ENCAPSULATION=====================//

        // Scanner input = new Scanner(System.in);

        // System.out.print("");

        // Loan loan1 = new Loan();
        // Loan loan1 = new Loan(8.5, 4, 120000.95);

        // System.out.printf("The loan was created on %s\n" + "The monthly payment is
        // %.2f\nThe total payment is %.2f\n",
        // loan1.getLoanDate().toString(), loan1.getMonthlyPayment(),
        // loan1.getTotalPayment());

        // loan1.printInfo(120000.00);
        // loan1.printInfo(10);
        // loan1.printInfo(12000.55, 2);

        Course course1 = new Course("OOP");
        Course course2 = new Course("DSA");

        course1.addStudent("Rizwan Ahmed");
        course1.addStudent("Ahmed");
        course1.addStudent("Hasan");
        course2.addStudent("Bilal");
        course2.addStudent("Kamran");

        String courseName = course1.getCourseName();
        String[] students = course1.getStudents();

        System.out.println(courseName);

        System.out.println("Number of students in " + course1.getCourseName() + " are " + course1.getNumberOfStudents());
        System.out.println("Number of students in " + course2.getCourseName() + " are " + course2.getNumberOfStudents());
        // System.out.println(students[0]);
    }
}
