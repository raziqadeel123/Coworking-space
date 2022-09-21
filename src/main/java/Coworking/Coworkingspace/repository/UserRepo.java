package Coworking.Coworkingspace.repository;

import Coworking.Coworkingspace.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository <User , Long>{
}
