package be.ucll.domain;

import org.jetbrains.annotations.*;

import java.util.Objects;

public class Profile {
    private String bio;
    private String location;
    private String interest;


    public Profile(String bio, String location, String interest) {
        setBio(bio);
        setLocation(location);
        setInterest(interest);
    }


    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        if (bio.isBlank()){
            throw new RuntimeException("This should not be empty");
        }
        this.bio = bio;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (location.isBlank()){
            throw new RuntimeException("This should not be empty");
        }
        this.location = location;
    }

    public String getInterest() {
        return interest;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "bio='" + bio + '\'' +
                ", location='" + location + '\'' +
                ", interest='" + interest + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return Objects.equals(bio, profile.bio) && Objects.equals(location, profile.location) && Objects.equals(interest, profile.interest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bio, location, interest);
    }

    public void setInterest(String interest) {
        if (interest.isBlank()){
            throw new RuntimeException("This should not be empty");
        }
        this.interest = interest;
    }
}
