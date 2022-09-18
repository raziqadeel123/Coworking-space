package Coworking.Services;

import Coworking.Coworkingspace.User.User;

import javax.management.relation.Role;
import java.util.List;

public interface UserServices  {
    User saveUser (User user);
    Role saveRole (Role role);
    void  assignRoleToUser (String email, String roleName);
    User getUser(String email, String firstName, String lastName);
    List<User> getUser();
}
