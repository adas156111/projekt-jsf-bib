package controler;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import model.User;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.UserDAOImpl;

@ManagedBean
@ViewScoped
public class UserLoginBean {

	private SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	private UserDAOImpl userImpl = new UserDAOImpl();
	private User user;
	
	private String login;
	private String password;
	
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String logowanie(){
		
		System.out.println("wesz³o");
		setLogin("Micha³");
		return "success";
//		userImpl.setSession(sessionFactory);
//		user = userImpl.userFindByLoginPassword(login, password);
//		System.out.println("dzia³a");
//		if(user != null)
//			return "success";
//		else
//			return "false";
		
	}
	
}
