package kodlamaio.HRMS.entities.dtos;

import lombok.Data;

@Data
public class CandidateAddDto {
	private int id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String nationalityId;
	private int birthYear;
	private String password;
	private String passwordRepead;
	
}
