package kodlamaio.HRMS.core.validator;



public class Validator implements ValidatorService {

	@Override
	public boolean isRealUser(String Password, String PasswordRepead) {
		
		if (Password.length() < 6 && Password != PasswordRepead) {
			return false;
		}else {
			return true;
		}	

	}

}
