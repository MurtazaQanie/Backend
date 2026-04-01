package be.ucll.service;

import be.ucll.model.User;
import be.ucll.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> getAllUsers(){
        return userRepository.getUsers();
    }


    public List<User> getAllAdults(){
        return userRepository.usersOlderThan(18);
    }


    public List<User> getAge(int min, int max){
        if (min > max){
            throw new RuntimeException("Minimum age cannot be greater than maximum age.");

        }
        if (max > 150 || min < 0){
            throw new RuntimeException("Invalid age range. Age must be between 0 and 150.");
        }
        return userRepository.getAge(min,max);

    }


    public List<User> getNameByCharater(String name){
        if (userRepository.getNameByCharacter(name).isEmpty()){
            throw new RuntimeException(" No users found with the specified name.");
        }
        return userRepository.getNameByCharacter(name);
    }


}
