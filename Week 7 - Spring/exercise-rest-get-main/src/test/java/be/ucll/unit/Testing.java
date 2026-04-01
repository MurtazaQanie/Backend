package be.ucll.unit;

import be.ucll.unit.*;
import be.ucll.unit.model.User;
import be.ucll.unit.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Testing {
    private UserRepository userRepository;


    @BeforeEach
    public void setUp(){
        userRepository = new UserRepository();
    }


    // happy Case
    @Test
    void givenEmail_whentheMehtodAsks_thenEmailisRetured(){
        User user = userRepository.getUserWithEmail("c@c.be");
        assertNotNull(user);
        assertEquals("c@c.be", user.getEmail());
    }

    @Test
    void givenNonExisitingEmail_whenGetUserWithEmail_theReturnsNull(){
        User user = userRepository.getUserWithEmail("does@email.be");
        assertNull(user);
    }


    @Test
    void givenACharacher_whenItContainsName_thenReturnsAList(){
        List<User> user = userRepository.getNameContaining("s");
        assertEquals(1,user.size() );
        assertNotNull(user);
        assertFalse(user.isEmpty());
        assertEquals("Charles", user.get(0).getName());
    }


    @Test
    void givenACharacter_whenItisNotinList_thenRetunsanEmptyList(){
        List<User> user = userRepository.getNameContaining("xyz");
        assertTrue(user.isEmpty());
    }


}
