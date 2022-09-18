package Coworking.Repository;
import Coworking.Coworkingspace.User.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
     Role findByroleTitle (String roleTile);
}
