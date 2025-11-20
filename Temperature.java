public class Temperature {
    private double value;

    public Temperature(double value) {
        setValue(value);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if (value < -273.15) {
            throw new IllegalArgumentException("Temperature cannot be below absolute zero");
        }
        this.value = value;
    }

    @Override
    public String toString() {
        return value + " °C";
    }
}

class MainTemperature {
    public static void main(String[] args) {
        Temperature temp = new Temperature(25.5);
        System.out.println("Initial Temperature: " + temp.getValue() + "°C");
        try {
            Temperature temp2 = new Temperature(-300);
            temp2.setValue(-300);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
