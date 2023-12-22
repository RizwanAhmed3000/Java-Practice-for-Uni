public class Rectangle extends Shapes {
    int height;
    int width;
    public void getArea(){
        System.out.println("the area of rectangle is: " + (this.height * this.width));
    }

    public void getColor(){
        System.out.println("the color of rectangle is: " + this.color);
    }
}
