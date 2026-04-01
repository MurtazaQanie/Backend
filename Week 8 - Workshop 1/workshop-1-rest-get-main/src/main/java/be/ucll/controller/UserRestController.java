package be.ucll.controller;

import be.ucll.model.User;
import be.ucll.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRestController {
    private UserService userService;


    public UserRestController(UserService userService){
        this.userService= userService;
    }


    @GetMapping
    public List<User> getNameByCharacter(@RequestParam(value = "name", required = false)String name){
        if (name.isBlank()||name==null){
            userService.getAllUsers();
        }
        return userService.getNameByCharater(name);
    }

    @GetMapping("/adults")
    public List<User> getAllAdults(){
        return userService.getAllAdults();
    }


    @GetMapping("/age/{min}/{max}")
    public List<User> getMinAge(@PathVariable int min, @PathVariable int max){
        return userService.getAge(min, max);
    }






}
