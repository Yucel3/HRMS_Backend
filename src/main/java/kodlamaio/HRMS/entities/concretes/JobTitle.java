package kodlamaio.HRMS.entities.concretes;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "jobtitles")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class JobTitle {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "jobtitle_id")
	private int id;
	
	@NotNull
	@Column(name = "title", unique = true)
	private String name;
	

	
	@NotNull
	@ManyToOne()
	@JoinColumn(name = "position_id")
	private Position positionId;
	
	@NotNull
	@ManyToOne()
	@JoinColumn(name = "city_id")
	private City cityId;
	
	@NotNull
	@ManyToOne()
	@JoinColumn(name = "company_id")
	private Company companyId;
	
	
	@Column(name = "create_date")
	private LocalDateTime createDate = LocalDateTime.now();
	
	@Column(name = "finish_date")
	private Date applicationDate;
	
	@NotNull
	@Column(name = "open_position")
	private int openPosition;
	
	@Column(name = "min_salary")
	private int minSalary;
	
	@Column(name = "max_salary")
	private int maxSalary;
	
	@NotNull
	@Column(name = "is_active")
	private boolean isActive;
	

}
