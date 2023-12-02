public class Tv {
    // Instance Variables (every object that uses this or change it will not effect
    // the other objects, stored in different locations)
    int channel = 1; // Default modifier (it can be access in any class within the same package)
    int volume = 1;
    boolean TvOn = false;
    int num = 1;
    String s;
    boolean x;
    // private int b; // can only access within the same class
    public boolean g; // can be access anywhere and in any package/class

    static int numberOfChannels; // Static variable (reference type store in same location)

    static int getNumberOfChannels() { // Static Methods
        return numberOfChannels;
    }

    final static int constantNumber = 100; // constant variable just like const in JS

    public Tv() {
    };

    // private Tv() {
    // };

    Tv(String newS) {
        s = newS;
        // b = 1;
    }

    public void print() {
        System.out.println(s);
    }

    public void turnOn() {
        TvOn = true;
    }

    public void turnOff() {
        TvOn = false;
    }

    public void setChannel(int newChannel) {
        if (TvOn && newChannel >= 1 && newChannel <= 100) {
            channel = newChannel;
        }
    }

    public void setVol(int newVol) {
        if (TvOn && newVol >= 1 && newVol <= 100) {
            volume = newVol;
        }
    }

}
