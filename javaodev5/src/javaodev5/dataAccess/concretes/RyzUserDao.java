package javaodev5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import javaodev5.dataAccess.abstracts.UserDao;
import javaodev5.entities.concretes.User;

public class RyzUserDao implements UserDao{
	
	

	
	




	@Override
	public void addU(User user) {
		users.add(user);
		System.out.println("Veri tabanýna kaydedildi :" + user.geteMail());
		
	}

	@Override
	public void login(String Email, String password) {
		// TODO Auto-generated method stub
		
	}










}
