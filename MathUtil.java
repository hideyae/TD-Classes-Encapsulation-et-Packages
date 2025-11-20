public class MathUtil {

    public static int clamp(int value, int min, int max) {
        if (value < min) {
            return min;
        } else if (value > max) {
            return max;
        } else {
            return value;
        }
    }
}

class MainMathUtil {
    public static void main(String[] args) {
        int value = 15;
        int min = 10;
        int max = 20;
        int clampedValue = MathUtil.clamp(value, min, max);
        System.out.println("Clamped Value: " + clampedValue);

        value = 5;
        clampedValue = MathUtil.clamp(value, min, max);
        System.out.println("Clamped Value: " + clampedValue);

        value = 25;
        clampedValue = MathUtil.clamp(value, min, max);
        System.out.println("Clamped Value: " + clampedValue);
    }
}