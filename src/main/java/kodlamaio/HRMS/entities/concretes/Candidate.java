package kodlamaio.HRMS.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name = "candidates")
public class Candidate extends User {

	@NotNull
	@Column(name = "first_name")
	private String FirstName;
	
	@NotNull
	@Column(name = "last_name")
	private String LastName;
	
	@NotNull
	@Column(name = "nationality_id", unique = true)
	private String NationalityId;

	@NotNull
	@Column(name = "birth_year")
	private int DateOfYear;
	
	@Column(name = "cv_id")
	private int cvId;
	

	@Column(name = "position_id")
	private int jobPositionId;
	
	@OneToMany(mappedBy = "candidateId")
	private List<Cv> cvc;


}
