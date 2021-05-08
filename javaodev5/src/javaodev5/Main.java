package javaodev5;

import java.util.ArrayList;

import jGoogle.Google;
import javaodev5.business.abstracts.UserService;
import javaodev5.business.concretes.UserManager;
import javaodev5.core.abstracts.CheckEmailService;
import javaodev5.core.abstracts.ValidationService;
import javaodev5.core.abstracts.VerificationService;
import javaodev5.core.adapters.GoogleValidationManager;
import javaodev5.core.concretes.CheckEmailManager;
import javaodev5.core.concretes.ValidationManager;
import javaodev5.core.concretes.VerificationManager;
import javaodev5.entities.concretes.User;
import javaodev5.dataAccess.abstracts.UserDao;
import javaodev5.dataAccess.concretes.RyzUserDao;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("Kaan", "KÜllaç", "kullackaan@gmail.com", "perdesiz");
		User user2 = new User("Recep", "yerebakan", "recepyer@gmail.com", "perdesizsd");
		User user3 = new User("Rcdfep", "yerebadfkan", "recepyer@gmail.com", "perdfdesizsd");
		
		ValidationService valid1 = new GoogleValidationManager(new Google());
		ValidationService valid = new ValidationManager();
		UserDao userDao = new RyzUserDao();
		VerificationService verify = new VerificationManager();
		CheckEmailService check = new CheckEmailManager();
		UserService userservice = new UserManager(valid, verify, userDao,check);
		
			
		
		userservice.signUp(user1);
		userservice.signUp(user2);
		userservice.signUp(user3);
		
		userservice.login("kullackaan@sgmail.com","perdesiz");
		userservice.login("kullackaan@gmail.com", "perdesiz");
			
		
		
		

		

		
	}

}
