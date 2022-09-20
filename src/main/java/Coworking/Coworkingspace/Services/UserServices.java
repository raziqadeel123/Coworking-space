package Coworking.Coworkingspace.Services;

import Coworking.Coworkingspace.Entity.User;
import Coworking.Coworkingspace.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {
    @Autowired
    UserRepo userRepo;

    public List <User> getAllUser(){
        List<User> users = new ArrayList<>();
        userRepo.findAll().forEach(users1 -> users.add(users1));
        return users;
    }
    public User getUsersById(Long id){
        return userRepo.findById(id).get();
    }

    public void saveOrUpate(User user){
        userRepo.save(user);
    }
    public void delete(Long id){
        userRepo.deleteById(id);
    }

    public void update(User user , int Userid){
        userRepo.save(user);
    }
}


