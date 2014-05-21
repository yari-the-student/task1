package org.yari.task1;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.yari.task1.dao.UserDao;

@Stateless(name = "UserManagerRemote")
@Remote(UserManagerRemote.class)
public class UserManagerImpl implements UserManagerRemote {

	@EJB
	private UserDao userDao;

	public void createUser(String name) {
		userDao.createUser(name);
	}

}
