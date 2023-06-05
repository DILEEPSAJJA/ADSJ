package user;
import java.util.List;
public interface IUser {
	boolean addUser(User user);
	boolean update(User user);
	User removeUser(int id);
	User find(int id);
	List<User> find();
}
