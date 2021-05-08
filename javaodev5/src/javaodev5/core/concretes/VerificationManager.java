package javaodev5.core.concretes;

import javaodev5.core.abstracts.VerificationService;
import javaodev5.entities.concretes.User;

public class VerificationManager implements VerificationService {

	@Override
	public boolean verifyAccount(User user) {
		System.out.println("onaylandý");
		return true;
	}


	

}
