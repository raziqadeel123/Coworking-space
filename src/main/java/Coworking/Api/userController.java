package Coworking.Api;

import Coworking.Coworkingspace.User.User;
import Coworking.Services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class userController {

    private final UserServices userServices;

    @GetMapping("/users")
    public ResponseEntity<List<User>>getUser(){
        return ResponseEntity.ok().body(userServices.getUser());
    }
    @PostMapping("/user/save")
    public  ResponseEntity<User>saveUser(@RequestBody User user)    {
        return ResponseEntity.ok().body(userServices.saveUser(user));
    }
}
