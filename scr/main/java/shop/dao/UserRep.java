package shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import shop.entity.User;

public interface UserRep extends JpaRepository<User, Long>{

	@Query("SELECT u FROM User u  where u.username like :userName")
	User findUserByName(@Param("userName") String userName);
    
	@Query("SELECT u From User u where u.email like :email and "
			+ "u.password like :passord")
	User findByEmailAndPassword(@Param("email") String email,
			                     @Param("password")String password);

	@Query("SELECT u. From User u where u.email like :email")
	User findUserByEmail(@Param("email") String email);

}
