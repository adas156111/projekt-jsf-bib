//package Test;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//import model.User;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//import controler.UserLoginBean;
//import dao.UserDAO;
//import dao.UserDAOImpl;
//
//public class Test {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
////		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
////		UserDAOImpl user = new UserDAOImpl();
//		
//////		ADD USER
////		user.setSession(sessionFactory);
////		User s1 = new User("Micha³", "Kwiatkowski", "kwiatmowski.mic@gmail.com", "kwiamic", "12345");
////		user.save(s1);
//		
//////		LIST USER
////		user.setSession(sessionFactory);
////		List<User> list = user.findAll();
////		Iterator<User> itr = list.iterator();
////		while(itr.hasNext())
////			System.out.println(itr.next());
//		
//////	LIST USER BY NAME
////	user.setSession(sessionFactory);
////	List<User> list = user.userFindByFirstnameName("Micha³", "Kwiatkowski");
////	Iterator<User> itr = list.iterator();
//		
////	while(itr.hasNext())
////		System.out.println(itr.next());		
//		
//////		EXISTS USER
////		user.setSession(sessionFactory);
////		System.out.println(user.exists(0));
//		
//////	GET USER BY ID
////	user.setSession(sessionFactory);
////	System.out.println(user.findById(1));		
//		
//		
//////	TEST BEAN
////		UserLoginBean bean = new UserLoginBean();
////		bean.setLogin("kwiamic");
////		bean.setPassword("12345");
////		System.out.println(bean.logowanie());
//	}
//
//}
