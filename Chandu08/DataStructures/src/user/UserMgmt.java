package user;
import java.util.Scanner;
import java.util.List;
public class UserMgmt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserDAO dao = new UserDAO(); 
		System.out.println("1.addUser 2.removeUser 3.updateUser 4.Display 5.FindUser 6.Exit");
		while(true) {
			System.out.print("Choose one from above : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 1 :System.out.println("Enter user name and password");
						String name = sc.nextLine();
						String pass = sc.nextLine();
						User user = new User(name,pass);
						System.out.println("Use added " + dao.addUser(user)); 
						break;
				case 2 :System.out.print("Enter id :");
						int id = sc.nextInt();
						sc.nextLine();
						System.out.println("User removed "+dao.removeUser(id));
						break;
				case 3 :System.out.print("Enter id to update : ");
						id = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter new name and password");
						name = sc.nextLine();
						pass = sc.nextLine();
						user = new User(id,name,pass);
						System.out.println("User updated : "+dao.update(user));
						break;
				case 4 :System.out.println("Users are : ");
						List<User> users = dao.find();
						users.forEach(System.out::println);
						break;
				case 5 :System.out.print("Enter id :");
						id = sc.nextInt();
						sc.nextLine();
						System.out.println("User : "+dao.find(id));
						break;
				case 6 :System.exit(0);
				default:System.out.println("Choose correct option");
			}
		}
	}

}
