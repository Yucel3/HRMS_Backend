package kodlamaio.HRMS.entities.dtos;

import java.sql.Date;

import lombok.Data;
@Data
public class JobTitleAddDto {
	
	private String name;
	private int positionId;
	private int cityId;
	private int companyId;
	private Date applicationDate;
	private int openPosition;
	private int minSalary;
	private int maxSalary;
	private boolean isActive;
	

}
