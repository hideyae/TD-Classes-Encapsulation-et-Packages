public class Rectangle2 {
    private double width;
    private double height;

    public Rectangle2(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width < 0");
        }
        this.width = width;
        return width;
    }

    public double setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height < 0");
        }
        this.height = height;
        return height;
    }

    public double area() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{width=" + width + ", height=" + height + "}";
    }
}

class MainRectangle2 {
    public static void main(String[] args) {
        Rectangle2 rect = new Rectangle2(5.0, 10.0);
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());

        rect.setWidth(15.0);
        rect.setHeight(20.0);
        System.out.println("Updated Width: " + rect.getWidth());
        System.out.println("Updated Height: " + rect.getHeight());
    }
}
