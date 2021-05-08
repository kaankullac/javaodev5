package javaodev5.business.abstracts;

import javaodev5.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void login(String eMail,String Password);

}
