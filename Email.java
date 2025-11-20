public final class Email {
    private final String value;

    public Email(String value) {
        if (value == null || !value.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}

class MainEmail {
    public static void main(String[] args) {
        Email email1 = new Email("deyae@gmail.com");
        System.out.println("Email 1: " + email1);
    }
}
