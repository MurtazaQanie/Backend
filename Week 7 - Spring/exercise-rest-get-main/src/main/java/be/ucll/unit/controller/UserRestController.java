package be.ucll.controller;

import java.util.List;

import be.ucll.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import be.ucll.model.User;
import be.ucll.service.UserService;

@RestController
@RequestMapping("/users")
public class UserRestController {

    private UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }



    @GetMapping("/search")
    public User getUserWithEmail(@RequestParam(value = "email", required = false)String email){
        return userService.getUserWithEmail(email);
    }

}


