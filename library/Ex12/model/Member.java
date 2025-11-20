package library.Ex12.model;

import java.util.*;

public class Member {
    private final String id, name, email;

    public Member(String id, String name, String email) {
        if (id == null || id.isBlank())
            throw new IllegalArgumentException("id cannot be blank");
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("name cannot be blank");
        if (email == null || !email.contains("@"))
            throw new IllegalArgumentException("invalid email");
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Member: id='" + id + "', name='" + name + "', email='" + email + "'.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Member))
            return false;
        Member m = (Member) o;
        return id.equals(m.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
