package com.mediastrip.service.mock;

import java.util.ArrayList;
import java.util.List;

import com.mediastrip.components.User;
import com.mediastrip.service.impl.DAO;
import com.mediastrip.service.impl.DAOException;

/**
 * Mock implementation of the User DAO.
 * 
 * @author Florian THIERRY
 *
 */
public class UserDAO extends DAO<User> implements IMock<User> {
	@Override
	public User persist(User pUser) throws DAOException {
		super.persist(pUser);
		
		return buildMock();
	}

	@Override
	public void delete(User pUser) throws DAOException {
		super.delete(pUser);
	}

	@Override
	public List<User> findAll() throws DAOException {
		List<User> userList = new ArrayList<User>();
		userList.add(buildMock());
		return userList;
	}

	@Override
	public User buildMock() {
		return new User("DUPONT", "Marcel", "dupont.marcel@gmail.com", "passe");
	}
}
