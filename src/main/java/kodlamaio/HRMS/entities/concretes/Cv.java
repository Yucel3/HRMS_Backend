package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor 
@Table(name = "cvs")
public class Cv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cv_id") 
	private int id;
	
	@NotNull
	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidate candidateId;
	
	@Column(name = "cv_title")
	private String title;
	
	@NotNull
	@Column(name = "cv_deatails")
	private String details;
	
	@NotNull
	@ManyToOne()
	@JoinColumn(name = "position_id")
	private Position positionId;
	
	
	@ManyToOne()
	@JoinColumn(name = "school_id")
	private School schoolId;

	@ManyToOne()
	@JoinColumn(name = "previousJob_id")
	private PreviousJob previousJobId;
	
	
	@ManyToOne()
	@JoinColumn(name = "language_id")
	private Language languageId;
	
	@ManyToOne()
	@JoinColumn(name = "city_id")
	private City cityId;
	
	@Column(name = "github")
	private String gitHub;
	
	@Column(name = "likedin")
	private String likedId;
	
	@Column(name = "photo")
	private String photo;
	
	@Column(name = "techonology")
	private int technologyId;

}
