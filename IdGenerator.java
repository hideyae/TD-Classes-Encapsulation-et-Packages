public class IdGenerator {
    private static long next = 1;

    public static long nextId() {
        next++;
        return next;
    }
}

class MaindGenerator {
    public static void main(String[] args) {
        System.out.println("Generated ID: " + IdGenerator.nextId());
        System.out.println("Generated ID: " + IdGenerator.nextId());
    }
}