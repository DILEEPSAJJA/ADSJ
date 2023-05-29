package contacts;

import java.util.*;

public class UserMgmtDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		UserDAO dao = new UserDAO();
		
		User user = new User("user123","1234");
		System.out.println(dao.addUser(user));
		
		List<User> users = dao.find();
		users.forEach(System.out::println);
		
		System.out.println("Enter id for updation : ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter updated username and password : ");
		String uname = sc.nextLine();
		String password = sc.nextLine();
		
		user = new User(id, uname, password);
		dao.updateUser(user);
		
		users = dao.find();
		users.forEach(System.out::println);
		
		System.out.println("Select the id to know the details : ");
		id = sc.nextInt();
		user = dao.find(id);
		System.out.println("User Details are : ");
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		
		System.out.println("Enter id to remove : ");
		id = sc.nextInt();
		System.out.println("Removes User : " + dao.removeUser(id));
		users = dao.find();
		users.forEach(System.out::println);
		
		sc.close();
	}
}
