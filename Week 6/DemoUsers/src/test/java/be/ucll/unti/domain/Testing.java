package be.ucll.unti.domain;

import be.ucll.domain.Profile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Testing {
    private String bio;
    private String location;
    private String interst;



    @BeforeEach
    public void setUp(){
        bio = "Male";
        location= "Belgium";
        interst= "Computer Science";
    }


    @Test
    void givenValidUser_whenaddingThem_thenTheyareAdded(){
        Profile profile = new Profile(bio, location, interst);
        assertThrows(RuntimeException.class, ()-> new Profile(null, "", ""));
    }
}
