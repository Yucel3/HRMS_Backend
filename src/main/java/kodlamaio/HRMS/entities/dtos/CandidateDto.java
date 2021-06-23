package kodlamaio.HRMS.entities.dtos;

import lombok.Data;

@Data
public class CandidateDto {
	private String firstName;
	private String lastName;
	private int birthYear;
	private String phoneNumber;
	private String email;
}
