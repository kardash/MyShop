package shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.dao.UserRep;
import shop.entity.User;
import shop.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRep ur;
	@Override
	public User addUser(User u) {
		ur.save(u);
		return u;
	}


	@Override
	public User findUserByName(String userName) {
		
		return ur.findUserByName(userName);
	}



	@Override
	public User login(String email, String password) {
		return ur.findByEmailAndPassword(email,password);
	
	}
	
    @Override
	public User findUserByEmail(String email) {
		return ur.findUserByEmail(email);
	}
	
}
