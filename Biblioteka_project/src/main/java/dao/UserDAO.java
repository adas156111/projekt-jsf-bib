package dao;

import java.util.List;

import model.User;

public interface UserDAO extends GenericDAO<User>{

	public List<User> userFindByName(String name);
	public List<User> userFindByFirstnameName(String first_name, String name);
	public User userFindByLoginPassword(String login, String password);
}
