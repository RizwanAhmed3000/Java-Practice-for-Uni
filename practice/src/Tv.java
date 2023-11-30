public class Tv {
    int channel = 1;
    int volume = 1;
    boolean TvOn = false;
    int num = 1;
    String s;
    boolean x;

    public Tv() {
    };

    Tv(String newS) {
        s = newS;
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
