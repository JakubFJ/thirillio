package com.semantincsquare.thrillio.managers;

import com.semanticsquare.thrillio.dao.UserDao;
import com.semanticsquare.thrillio.entities.User;

public class UserManager {
	private static UserManager instance = new UserManager();
	private static UserDao dao = new UserDao();

	private UserManager() {
	}

	public static UserManager getInstance() {
		return instance;
	}

	public User createUser(long id, String email, String password, String firstName, String lastName, int gendrer,
			String userType) {
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setPasswords(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setGender(gendrer);
		user.setUserType(userType);

		return user;
	}
	
	public User[] getUsers() {
		return dao.getUsers();
	}
}
