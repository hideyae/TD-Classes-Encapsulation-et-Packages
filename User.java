public class User {
    private String username, email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override // annotation to indicate method overriding (optional) override maens
              // redefinition
    public String toString() {
        return "Username: " + this.username + ", Email: " + this.email;
    }
}

class MainUser {
    public static void main(String[] args) {
        User u1 = new User("deyae.h", "deyae@gmail.com");
        User u2 = new User("jihane.r", "jihane@gmail.com");
        System.out.println(u1);
        System.out.println(u2);

        User u3 = u1;
        System.out.println(u1 == u3); // true
        System.out.println(u1 == u2); // false

    }
}
