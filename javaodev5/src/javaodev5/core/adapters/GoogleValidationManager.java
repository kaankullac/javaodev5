package javaodev5.core.adapters;

import jGoogle.Google;
import javaodev5.core.abstracts.ValidationService;
import javaodev5.entities.concretes.User;

public class GoogleValidationManager implements ValidationService{

	private Google google;
	
	
	public GoogleValidationManager(Google google) {
		super();
		this.google = google;
	}


	@Override
	public boolean isValidUser(User user) {
		google.registerGoogle();
		
		return true;
	}

}
