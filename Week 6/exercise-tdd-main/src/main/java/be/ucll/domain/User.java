package be.ucll.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private String name;
    private int age;
    private String email;
    private String password;
    private List<Integer> membershipYears = new ArrayList<Integer>();

    public User(String name, int age) {
        setAge(age);
        setName(name);
    }

    public User(String name, int age, String email) {
        setName(name);
        setAge(age);
        setEmail(email);

    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){

        if (getAge() < 18){
            throw new RuntimeException("Only adults can have a password");}

        if (password.length() < 3 || password.isEmpty() || password.isBlank()|| password==null){
            throw new RuntimeException("Password must have at least 3 characters");}
        this.password = password;

    }


    public boolean isPasswordCorrect(String password){
        if (password.equals(this.password)){
            return true;
        }
        return false;
    }






    public String getEmail(){return  this.email;}
    public void setEmail(String email){
        if (email.contains("@") && email.contains(".")){
            this.email=email;
        }
        else {
            throw new RuntimeException("Email must contain dot and @.");
        }
        }
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 150){this.age = age;}
        else {
            throw new RuntimeException("Age must be positive and not more than 150");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new RuntimeException("Name can not be empty");
        }
        this.name = name;
    }

    public int countYearsOfMembership() {
        return membershipYears.size();
    }

    public void addMembershipYear(int year) {
        membershipYears.add(year);
    }

    public int countMembershipYearsAfter1999() {
        int result = 0;
        for (Integer year : membershipYears) {
            if (year > 1999) {
                result++;
            }
        }
        return result;
    }

    public boolean equals(User otherUser) {
        return this.name.equals(otherUser.getName()) && this.age == otherUser.getAge();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.age != other.age) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "User " + getName()+"(" + getEmail()+") is " + getAge() +" years old.";
}

    protected boolean isAdult() {
        if (getAge() > 18){
            return true;
        }
        return false;

    }
}
