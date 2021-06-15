package kodlamaio.HRMS.entities.dtos;

import java.sql.Date;

import lombok.Data;

@Data
public class JobTitleDto {
	
	private String name;
	private String positionName;
	private String cityName;
	private String companyName;
	private Date applicationDate;
	private int openPosition;
	private int minSalary;
	private int maxSalary;
	
}
