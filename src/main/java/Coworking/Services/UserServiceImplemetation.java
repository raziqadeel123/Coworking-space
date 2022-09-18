package Coworking.Services;


import Coworking.Coworkingspace.User.User;
import Coworking.Coworkingspace.User.Role;
import Coworking.Repository.RoleRepo;
import Coworking.Repository.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @RequiredArgsConstructor  @Transactional @Slf4j
public class UserServiceImplemetation implements UserServices {

    private final UserRepo userRepo;
    private final RoleRepo roleRepo;

    @Override
    public User saveUser(User user) {
        log.info("Saving new user info");
        return  userRepo.save(user);
    }

    @Override
    public javax.management.relation.Role saveRole(javax.management.relation.Role role) {
        return null;
    }


    public Role saveRole(Role role) {
        log.info("Saving new user info");
        return roleRepo.save(role);
    }

    @Override
    public void assignRoleToUser(String email, String roleName) {
        User user = userRepo.findeByEmail(email);
        Coworking.Coworkingspace.User.Role role = roleRepo.findByroleTitle(roleName);
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String email, String firstName, String lastName) {
        return userRepo.findeByEmail(email);
    }

    @Override
    public List<User> getUser() {
        return userRepo.findAll();
    }
}
