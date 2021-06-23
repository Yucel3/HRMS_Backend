package kodlamaio.HRMS.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "candidates")
public class Candidate extends User {

	@NotNull
	@Column(name = "first_name")
	private String firstName;

	@NotNull
	@Column(name = "last_name")
	private String lastName;

	@NotNull
	@Column(name = "nationality_id", unique = true)
	private String nationalityId;

	@NotNull
	@Column(name = "birth_year")
	private int birthYear;

	@OneToMany(mappedBy = "candidate")
	private List<Cv> cv;

}
