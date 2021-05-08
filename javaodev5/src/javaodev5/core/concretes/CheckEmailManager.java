package javaodev5.core.concretes;

import java.util.ArrayList;

import javaodev5.core.abstracts.CheckEmailService;
import javaodev5.dataAccess.abstracts.UserDao;
import javaodev5.entities.concretes.User;

public class CheckEmailManager implements CheckEmailService {

	@Override
	public boolean check(User user) {
		
		for(User test : UserDao.users) {
			if(user.geteMail()==test.geteMail()) {
				System.out.println("Kullanýlmýþ e mail");
				return false;
			}
			
			
		}
		
		return true;
	}
	

}
