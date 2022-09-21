package Coworking.Coworkingspace.controller;

import Coworking.Coworkingspace.entity.User;
import Coworking.Coworkingspace.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/auth")
public class userController {
         @Autowired
         UserServices userServices;

         @GetMapping("/user")
        private List<User> getAllUser(){
             return userServices.getAllUser();
         }

         @GetMapping("/user/{userid}")
         private User getUser(@PathVariable("userid") Long userid){
             return userServices.getUsersById(userid);
         }
         @DeleteMapping("/user/{userid}")
            private void deleteUser(@PathVariable("userid") Long userid){
             userServices.delete(userid);
         }
         @PostMapping("/users")
         private Long saveUser(@RequestBody User User){
             userServices.saveOrUpate(User);
             return User.getUserId();
         }

         @PutMapping("/users")
            private User update(@RequestBody User user){
             userServices.saveOrUpate(user);
             return user;
         }
}
