package be.ucll.domain;

import java.util.ArrayList;
import java.util.List;

public class Parent extends User {
    private int maxNumberOfChildern;

    private List<User> children = new ArrayList<>();

    public Parent(String name, int age, String email, int maxNumberOfChildern) {
        super(name, age, email);
        setMaxNumberOfChildern(maxNumberOfChildern);

    }

    public int getMaxNumberOfChildern() {
        return maxNumberOfChildern;
    }

    public void setMaxNumberOfChildern(int maxNumberOfChildern) {
        if (getMaxNumberOfChildern() < 0){
            throw new RuntimeException("Maximum childern cannot be negative or zero");
        }
        this.maxNumberOfChildern = maxNumberOfChildern;
    }

    public void addChild(User user) {
        if (user.isAdult()) {
            throw new RuntimeException("No adult as child allowed");
        }
        if (getChildren().size() >= getMaxNumberOfChildern()){
            throw new RuntimeException("You can't have more childern");

        }
        this.children.add(user);
    }

    public List<User> getChildren() {
        return this.children;
    }

    @Override
    public String toString() {
        return super.toString() + " with " + getChildren().size() + " children";
    }


}
