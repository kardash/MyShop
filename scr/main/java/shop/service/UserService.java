package shop.service;

import shop.entity.User;

public interface UserService {

	public User addUser(User u);
	public User findUserByName(String userName);
	public User login(String email, String password) ;
	public User findUserByEmail(String email);
	
	
}
