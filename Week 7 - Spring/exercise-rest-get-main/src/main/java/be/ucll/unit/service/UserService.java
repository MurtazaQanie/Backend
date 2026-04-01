package be.ucll.unit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import be.ucll.unit.model.User;
import be.ucll.unit.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public User getUserWithEmail(String email){
        return  userRepository.getUserWithEmail(email);
    }

    public List<User> getNameContaining(String name){return userRepository.getNameContaining(name);}
}
