package be.ucll.unit.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import be.ucll.unit.model.User;
import be.ucll.unit.service.UserService;

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

    @GetMapping("/search/containing/{name}")
    public List<User> getNameContaining(@PathVariable String name){
        return userService.getNameContaining(name);
    }

}


