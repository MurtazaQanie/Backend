package be.ucll.model;

public class User {

    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email) {
        setAge(age);
        setName(name);
        setEmail(email);
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new RuntimeException("Name can not be empty");
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
