package javaodev5.core.concretes;

import javaodev5.core.abstracts.ValidationService;
import javaodev5.entities.concretes.User;

import java.util.List;
import java.util.regex.Pattern;

public class ValidationManager implements ValidationService {

	@Override
	public boolean isValidUser(User user) {
		String regexString = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		if (!Pattern.compile(regexString).matcher(user.geteMail()).matches()) {
			System.out.println("Hata1");
			return false;
		}
		if(user.getFirstName().length()<2) {
			System.out.println("Hata2");
			return false;
		}
		if(user.getLastName().length()<2) {
			System.out.println("Hata3");
			return false;
		}
		if(user.getPassword().length()<6) {
			System.out.println("Hata4");
			return false;
		}
		
		
		
		return true;
	}

}
