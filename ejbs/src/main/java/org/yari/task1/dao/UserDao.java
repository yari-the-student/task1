package org.yari.task1.dao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.yari.task1.entity.User;

@Stateless
@LocalBean
public class UserDao extends AbstractDao<User> {

    @PersistenceContext(unitName = "task1_pu")
    private EntityManager entityManager;

	public UserDao() {
		super(User.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}

	public User findUserByName(String name) {
		return namedQuery(User.QUERY_FIND_BY_NAME).setParameter("name", name)
				.getSingleResult();
	}

	public void createUser(String name) {
		User user = new User(name);
		persist(user);
	}

	public void deleteUser(User u) {
		remove(u);
	}
	
}
