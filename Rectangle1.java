public class Rectangle1 {
    public double width;
    public double height;

}

class MainRectangle1 {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1();
        Rectangle1 r2 = new Rectangle1();

        r1.width = 6;
        r1.height = 8;

        r2.width = 4.4;
        r2.height = 2.2;

        System.out.println("Area r1 = " + (r1.width * r1.height));
        System.out.println("Area r2 = " + (r2.width * r2.height));

    }
}