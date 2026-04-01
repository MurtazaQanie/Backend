package be.ucll.unit.unit.service;


import be.ucll.repository.UserRepository;
import be.ucll.service.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserServiceTest {

    @Test
    void givenRepositiy_whenCallingAllUsers_thenAllUsersReturned(){
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);





        assertEquals(userRepository.getUsers().size(), userService.getAllUsers().size());
        assertTrue(userRepository.getUsers().containsAll(userService.getAllUsers()));
    }
}
