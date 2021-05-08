package javaodev5.business.concretes;

import javaodev5.business.abstracts.UserService;
import javaodev5.core.abstracts.CheckEmailService;
import javaodev5.core.abstracts.ValidationService;
import javaodev5.core.abstracts.VerificationService;
import javaodev5.dataAccess.abstracts.UserDao;

import javaodev5.entities.concretes.User;

public class UserManager implements UserService{
	private ValidationService validservice;
	private VerificationService verify ;
	private UserDao userDao;
	private CheckEmailService check;
	



	public UserManager(ValidationService validservice, VerificationService verify, UserDao userDao,CheckEmailService check) {
		super();
		this.validservice = validservice;
		this.verify = verify;
		this.userDao = userDao;
		this.check = check;
	}

	@Override
	public void signUp(User user) {
		if(!check.check(user)) {
			System.out.println("Kay�t olu�turalamad�");
			System.out.println("-----------------");
			
		}
		
		else {
		
		
		if(validservice.isValidUser(user)) {
			System.out.println("Kay�t olu�turuldu "+user.getFirstName());
			System.out.println("---------------");
			
			userDao.addU(user);
			
			System.out.println("�yelik onay� bekleniyor.");
			System.out.println("-------------------");
			
			if(verify.verifyAccount(user)) {
				System.out.println("�yelik onayland�");
				System.out.println("---------------");
			}
			else {
				System.out.println("�yelik onaylanmad�");
				System.out.println("-------------------");
			}
			
		}
		else {
			System.out.println("Kay�t olu�turulamad� "+user.getFirstName());
			System.out.println("-----------------------");
		}
		
		
	}
	}
	@Override
	public void login(String eMail,String Password) {
		int i =1;
		for(User log : UserDao.users ) 
			if(eMail==log.geteMail()) {
				i=0;
				if(Password==log.getPassword()) {
					System.out.println("Giri� yap�ld� - "+ "Ho�geldiniz - "+log.getFirstName());
					System.out.println("-----------------------");
					
				}
				else {
					System.out.println("Yanl�� �ifre");
					System.out.println("------------------------");
					
				}
				
			}
			if(i==1) {
				System.out.println("Yanl�� kullan�c� ad�");
			}
			
		}
		
		
	}


