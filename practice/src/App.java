public class App {
    static void myStaticClass(){
        System.out.println("this is static method");
    }

    public void myPublicMethod(){
        System.out.println("this is a public method");
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Tv Tv1 = new Tv();
        Tv1.turnOn();
        Tv1.setChannel(21);
        Tv1.setVol(30);
        // myStaticClass();
        App class1 = new App();
        class1.myPublicMethod();

        System.out.println("Tv1 channel is " + Tv1.channel + " and volume is " + Tv1.volume);
    }
}
