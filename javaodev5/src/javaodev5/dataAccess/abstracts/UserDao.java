package javaodev5.dataAccess.abstracts;



import java.util.ArrayList;

import javaodev5.entities.concretes.User;

public interface UserDao {
	
	public static ArrayList<User> users = new ArrayList<User>();
	
	
	void addU(User user);
	void login(String Email,String password);
}
