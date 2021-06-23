package kodlamaio.HRMS.core.validator;

import org.springframework.stereotype.Service;

@Service
public class Validator implements ValidatorService {

	@Override
	public boolean isRealUser(String Password, String PasswordRepead) {
		
		if (Password.length() > 5 && Password == PasswordRepead) {
			return true;
		}else {
			return false;
		}	

	}

}
