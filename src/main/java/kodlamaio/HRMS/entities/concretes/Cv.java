package kodlamaio.HRMS.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cvs")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class Cv {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cv_id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "candidate")
	private Candidate candidate;

	@ManyToOne
	@JoinColumn(name = "cover_letter")
	private CoverLetter coverLetter;

	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<Position> position;

	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<School> school;

	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<PreviousJob> previousJob;

	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<Language> language;

	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<Link> link;

	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<Technology> technology;

}
