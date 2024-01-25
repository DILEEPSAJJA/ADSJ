package contacts;
import java.util.*;

public class UserDAO implements IUserDAO{
	ArrayList<User> users;
	public UserDAO() {
		users = new ArrayList<>();
		users.add(new User("user1","user1@123"));
		users.add(new User("user2","user2@123"));
		users.add(new User("user3","user3@123"));
	}
	@Override
	public boolean addUser(User user) {
		if(isUnameVaild(user.getName())) {
			users.add(user);
			return true;
		}
		return false;
	}
	private boolean isUnameVaild(String name) {
		for(User user : users) {
			if(name.equals(user.getName()))
				return false;
		}
		return true;
	}
	
	@Override
	public boolean updateUser(User user) {
		for(int i=0 ; i<users.size() ; i++) {
			User currUser = users.get(i);
			if(user.getId() == currUser.getId()) {
				users.set(i, user);
				return true;
			}
		}
		return false;
	}
	
	@Override
	public User find(int id) {
		for(int i=0 ; i<users.size() ; i++) {
			User currUser = users.get(i);
			if(id == currUser.getId()) {
				return currUser;
			}
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> find() {
		return (List<User>)users.clone();
	}
	
	@Override
	public User removeUser(int id) {
		for(int i=0; i<users.size();i++) {
			User currUser = users.get(i);
			if(id == currUser.getId()) {
				users.remove(i);
				return currUser;
			}
		}
		return null;
	}
}
