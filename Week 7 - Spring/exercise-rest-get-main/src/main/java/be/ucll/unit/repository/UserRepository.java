package be.ucll.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import be.ucll.model.User;

@Repository
public class UserRepository {

    private List<User> userRepository = new ArrayList<>();

    public UserRepository() {
        User amelia = new User("Amelia", 44, "a@a.be");
        User ben = new User("Ben", 15, "b@b.be");
        User charles = new User("Charles", 65, "c@c.be");
        User diana = new User("Diana", 13, "d@d.be");
        addUser(amelia);
        addUser(ben);
        addUser(charles);
        addUser(diana);

    }

    public List<User> getAllUsers() {
        return userRepository;
    }

    public boolean addUser(User user) {
        return userRepository.add(user);
    }


    public User getUserWithEmail(String email){
        for (User user: userRepository){

        if (user.getEmail().equals(email)){
            return user;
        }
        }
        return null;

    }





}
