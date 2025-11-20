public class Point {
    private int x, y;

    public Point() {
        this(0, 0);// appel au constructeur avec parametres
    }

    public Point(int x, int y) { // c'est une surchage de constructeur
        this.x = x;
        this.y = y;
    }

    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}

class MainPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(5, 10);
        p1.translate(8, -5);
        p2.translate(3, -2);
    }
}
