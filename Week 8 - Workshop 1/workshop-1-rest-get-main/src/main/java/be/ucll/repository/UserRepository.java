package be.ucll.repository;

import be.ucll.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> users;


    public UserRepository() {
       users = new ArrayList<>(List.of(new User("John Doe", 25, "john.doe@ucll.be", "john1234"),
               new User("Jane Toe", 30, "jane.toe@ucll.be", "jane1234"),
               new User("Jack Doe", 5, "jack.doe@ucll.be", "jack1234"),
               new User("Sarah Doe", 4, "sarah.doe@ucll.be", "sarah1234"),
               new User("Birgit Doe", 18, "birgit.doe@ucll.be", "birgit1234")));

    }

    public List<User> getUsers(){
        return users;
    }

    public List<User> usersOlderThan(int age){
        List<User> adults = new ArrayList<>();
        for (User user: users){
            if (user.getAge() >= age){
                adults.add(user);
            }

        }
        return adults;
    }


    public List<User> getAge(int min, int max){
        List<User> greaterorEqual = new ArrayList<>();

        for (User user: users){
            if (user.getAge() <= max && user.getAge() >= min ){
                greaterorEqual.add(user);
            }
        }

        return greaterorEqual;
    }

    public List<User> getNameByCharacter(String name){
        List<User> names=  new ArrayList<>();

        for (User user: users){
            if (user.getName().contains(name)){
                names.add(user);
            }
        }
        return names;
    }


    }






