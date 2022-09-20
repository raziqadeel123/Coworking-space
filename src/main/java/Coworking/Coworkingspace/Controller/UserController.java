package Coworking.Coworkingspace.Controller;

import Coworking.Coworkingspace.Entity.User;
import Coworking.Coworkingspace.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/auth")
public class UserController {
         @Autowired
         UserServices userServices;

         @GetMapping("/user")
        private List<User> getAllUser(){
             return userServices.getAllUser();
         }

         @GetMapping("/user/{Userid}")
         private User getUser(@PathVariable("Userid") Long Userid){
             return userServices.getUsersById(Userid);
         }
         @DeleteMapping("/user/{Userid}")
            private void deleteUser(@PathVariable("Userid") Long Userid){
             userServices.delete(Userid);
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
