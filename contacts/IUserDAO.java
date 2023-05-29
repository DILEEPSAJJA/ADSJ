package contacts;

import java.util.List;

public interface IUserDAO {
	boolean addUser(User user);
	boolean updateUser(User user);
	User find(int id);
	List<User> find();
	User removeUser(int id);
}
