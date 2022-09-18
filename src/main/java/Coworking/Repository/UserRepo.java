package Coworking.Repository;

import Coworking.Coworkingspace.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, Long> {
    User findeByEmail(String email);
}
