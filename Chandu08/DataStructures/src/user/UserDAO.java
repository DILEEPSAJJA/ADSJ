package user;
import java.util.ArrayList;
import java.util.List;
public class UserDAO implements IUser{
	ArrayList<User> users;
	public UserDAO() {
		users = new ArrayList<>();
		users.add(new User("Chandu", "7896"));
		users.add(new User("Charan", "1233"));
		users.add(new User("Sai", "5638"));
	}
	
	public boolean addUser(User user) {
		if(!isValid(user.getName()))
			return false;
		users.add(user);
		return true;
	}
	
	public boolean isValid(String name) {
		for(User user : users)
			if(user.getName() == name)
				return false;
		return true;
	}

	@Override
	public boolean update(User user) {
		for(int i = 0;i<users.size();i++) {
			if(users.get(i).getId() == user.getId())
			{
				users.set(i, user);
				return true;
			}
		} 
		return false;
	}

	@Override
	public User removeUser(int id) {
		for(int i = 0;i<users.size();i++)
		{
			User curUser = users.get(i);
			if(id == curUser.getId())
			{
				users.remove(i);
				return curUser;
			}
		}
		return null;
	}

	@Override
	public User find(int id) {
		for(int i = 0;i<users.size();i++)
		{
			User curUser = users.get(i);
			if(id == users.get(i).getId())
				return curUser;
		}
		return null;
	}

	@Override
	public List<User> find() {
		return (List<User>)users.clone();
	}
	
}
