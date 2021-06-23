package kodlamaio.HRMS.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitilazer","handler","jobtitles"})
@EqualsAndHashCode(callSuper=false)
@Table(name = "companies")
public class Company extends User{
	
	@NotNull
	@Column(name = "name")
	private String companyName;
	
	@NotNull
	@Column(name = "web_adress" )
	private String companyWebAdress;
	
	@OneToMany(mappedBy = "companyId")
	private List<JobTitle> jobtitles;
	
	@OneToMany(mappedBy = "company")
	private List<PreviousJob> jobs;
	

}
