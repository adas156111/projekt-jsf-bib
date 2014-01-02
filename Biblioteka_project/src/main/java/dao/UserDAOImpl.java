package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import model.User;

public class UserDAOImpl extends GenericDAOImpl<User> implements UserDAO {

//	@Override
//	public void save(User entity) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void update(User entity) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void saveorupdate(User entity) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void delete(User entity) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public User findById(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean exists(int id) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public List<User> findall() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public List<User> userFindByName(String name) {
		// TODO Auto-generated method stub
		List<User> list;
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(User.class).add(Restrictions.like("name", name));
		list = criteria.list();
		session.close();
		return list;
	}

	@Override
	public List<User> userFindByFirstnameName(String first_name, String name) {
		// TODO Auto-generated method stub
		List<User> list;
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(User.class).add(Restrictions.and(Restrictions.like("first_name", first_name),Restrictions.like("name", name)));
		list = criteria.list();
		session.close();
		return list;
	}

	@Override
	public User userFindByLoginPassword(String login, String password) {
		// TODO Auto-generated method stub
		User user;
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(User.class).add(Restrictions.and(Restrictions.like("login", login),Restrictions.like("password", password)));
		user = (User) criteria.uniqueResult();
		session.close();
		return user;
	}

}
