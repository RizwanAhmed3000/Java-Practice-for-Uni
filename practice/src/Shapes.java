public class Shapes {
    public String color;
    public boolean filled;
    public java.util.Date dateCreated;

    public void getShapeInfo(){
        System.out.println(this.color + " Color");
        System.out.println(this.filled + " filled");
        System.out.println(this.dateCreated + " Created at");
    }
}
