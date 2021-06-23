package kodlamaio.HRMS.entities.dtos;

import lombok.Data;

@Data
public class CompanyAddDto {
	private String companyName;
	private String companyWebAdress;
	private String email;
	private String phoneNumber;
	private String password;
	private String passwordRepeat;
}
